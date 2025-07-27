package DSA.financialForecasting;

public class Expense {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}
