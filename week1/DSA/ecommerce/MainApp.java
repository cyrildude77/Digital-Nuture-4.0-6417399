package DSA.ecommerce;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());

            products.add(new Product(name, category, price));
        }

        System.out.println("\nEnter your search filters:");

        System.out.print("Enter category to search (or leave blank to skip): ");
        String categoryFilter = sc.nextLine();

        System.out.print("Enter minimum price (or -1 to skip): ");
        double minPrice = Double.parseDouble(sc.nextLine());

        System.out.print("Enter maximum price (or -1 to skip): ");
        double maxPrice = Double.parseDouble(sc.nextLine());

        List<Filter> filters = new ArrayList<>();

        if (!categoryFilter.isBlank()) {
            filters.add(new CategoryFilter(categoryFilter));
        }

        if (minPrice >= 0 && maxPrice >= 0) {
            filters.add(new PriceFilter(minPrice, maxPrice));
        }

        SearchEngine engine = new SearchEngine();
        List<Product> results = engine.search(products, filters);

        System.out.println("\nSearch Results:");
        if (results.isEmpty()) {
            System.out.println("No products matched your filters.");
        } else {
            for (Product p : results) {
                System.out.println(p);
            }
        }

        sc.close();
    }
}
