package DSA.financialForecasting;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Income> incomes = new ArrayList<>();
        List<Expense> expenses = new ArrayList<>();

        System.out.print("Enter number of income sources: ");
        int in = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < in; i++) {
            System.out.print("Income source name: ");
            String src = sc.nextLine();
            System.out.print("Amount: ");
            double amt = sc.nextDouble(); sc.nextLine();
            incomes.add(new Income(src, amt));
        }

        System.out.print("Enter number of expenses: ");
        int ex = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ex; i++) {
            System.out.print("Expense category: ");
            String cat = sc.nextLine();
            System.out.print("Amount: ");
            double amt = sc.nextDouble(); sc.nextLine();
            expenses.add(new Expense(cat, amt));
        }

        System.out.print("Enter starting balance: ");
        double starting = sc.nextDouble();

        System.out.print("Forecast for how many months? ");
        int months = sc.nextInt();

        ForecastService service = new ForecastService(incomes, expenses);
        service.forecast(months, starting);

        sc.close();
    }
}
