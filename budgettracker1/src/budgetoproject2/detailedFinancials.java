package budgetoproject2;

public class detailedFinancials {
    public static void detailedFinancials() {
        System.out.println("Expenses Breakdown:");
        System.out.println("Food Expenses: " + expenses.FoodExpense);
        System.out.println("Utilities Expenses: " + expenses.UtilitiesExpense);
        System.out.println("Entertainment Expenses: " + expenses.EntertainmentExpense);
        System.out.println("Miscellaneous Expenses: " + expenses.MiscExpense);

        System.out.println("Total Expenses: " + expenses.totalExpense);

        System.out.println("Savings Information:");
        System.out.println("Total Savings: " + savings.totalSavings);

        detailedExpenses(); // Call the detailedExpenses method
        detailedSavings();  // Call the detailedSavings method
    }

    // Additional methods for displaying detailed expenses and savings could be defined here
    public static void detailedExpenses() {
        // Implement detailed expenses breakdown here
    }

    public static void detailedSavings() {
        // Implement detailed savings breakdown here
    }
}
