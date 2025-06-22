package DSA.ecommerce;
import java.util.*;

public class SearchEngine {
    public List<Product> search(List<Product> products, List<Filter> filters) {
        List<Product> result = new ArrayList<>();

        for (Product product : products) {
            boolean allMatch = true;
            for (Filter filter : filters) {
                if (!filter.matches(product)) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) result.add(product);
        }

        return result;
    }
}
