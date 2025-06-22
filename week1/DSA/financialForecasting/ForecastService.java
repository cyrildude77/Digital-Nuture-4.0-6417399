package DSA.financialForecasting;

import java.util.List;

public class ForecastService {
    private List<Income> incomes;
    private List<Expense> expenses;

    public ForecastService(List<Income> incomes, List<Expense> expenses) {
        this.incomes = incomes;
        this.expenses = expenses;
    }

    public double calculateNetMonthlyBalance() {
        double totalIncome = incomes.stream().mapToDouble(Income::getAmount).sum();
        double totalExpenses = expenses.stream().mapToDouble(Expense::getAmount).sum();
        return totalIncome - totalExpenses;
    }

    public void forecast(int months, double startingBalance) {
        double netMonthly = calculateNetMonthlyBalance();
        double balance = startingBalance;

        System.out.println("\n--- Financial Forecast ---");
        for (int i = 1; i <= months; i++) {
            balance += netMonthly;
            System.out.printf("Month %d: ₹%.2f\n", i, balance);
        }
    }
}
