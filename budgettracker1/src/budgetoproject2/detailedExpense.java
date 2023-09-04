package budgetoproject2;

public class detailedExpense extends expenses {
    public static double detailedExpenses() {
        System.out.println(tracker.name + "'s Total Expenses are divided in 4 parts : ");
        System.out.println(tracker.name + "'s Total Expenses on Food : " + FoodExpense); // Displaying food expenses
        System.out.println(tracker.name + "'s Total Expenses on Utilities : " + UtilitiesExpense); // Displaying utilities expenses
        System.out.println(tracker.name + "'s Total Expenses on Entertainment : " + EntertainmentExpense); // Displaying entertainment expenses
        System.out.println(tracker.name + "'s Total Expenses on Miscellaneous Items : " + MiscExpense); // Displaying misc. expenses

        totalExpense = FoodExpense + UtilitiesExpense + EntertainmentExpense + MiscExpense;
        System.out.println(tracker.name+ "'s Total Financial Expenses for this month are : " + totalExpense);

        if (tracker.budget >= totalExpense) {
            double remainingBudget = tracker.budget - totalExpense;
            System.out.println("Your remaining budget for this month is : " + remainingBudget);
        } else {
            double exceededAmount = totalExpense - tracker.budget;
            System.out.println("You have exceeded your budget by " + exceededAmount + " dollars.");
        }

        return totalExpense;
    }
}
