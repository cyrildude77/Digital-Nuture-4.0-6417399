package DSA.ecommerce;
public class CategoryFilter implements Filter {
    private String category;

    public CategoryFilter(String category) {
        this.category = category.toLowerCase();
    }

    public boolean matches(Product product) {
        return product.getCategory().toLowerCase().equals(category);
    }
}

