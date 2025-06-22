package DSA.ecommerce;
public class PriceFilter implements Filter {
    private double min, max;

    public PriceFilter(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean matches(Product product) {
        return product.getPrice() >= min && product.getPrice() <= max;
    }
}
