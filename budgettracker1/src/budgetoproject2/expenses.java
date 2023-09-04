package budgetoproject2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class expenses
{

    enum categories{
    Food,
    Utilities,
    Entertainment,
    Miscellaneous
    }

    public static double totalExpense; // Global variable to store and calculate User's Total expense.
    public static String category; // Global variable to store specific category of expense.
    public static ArrayList<Double> expenseArr = new ArrayList<Double>(); // Arraylist used for storing vales for User's Expenses



    public static double FoodExpense = 0; // Global variable to store Total Food Expenses
    // FoodExpenses() function
    // FoodExpenses() function is used for all the calculations related to food category.
    public static double FoodExpenses(){
        Scanner scan1 = new Scanner(System.in);
        double expense1 = 0;
        do {
            System.out.println("Enter the value of new expenses for " + categories.Food + " category : "); // Asking for new food expense
            System.out.println("Enter 0 to exit");
            expense1 = scan1.nextDouble();
            expenseArr.add(expense1);
            FoodExpense = FoodExpense + expense1 ; // calculating total food expenses
            System.out.println("Total expenses of this month for " + categories.Food + " category are: " + FoodExpense);
        }
        while (expense1 != 0);
        return FoodExpense;
    }


    public static double UtilitiesExpense = 0; // Global variable to store Total Rent and Utilities Expenses
    // UtilitiesExpenses() function
    // UtilitiesExpenses() function is used for all the calculations related to Rent and Utilities category.
    public static double UtilitiesExpenses(){
        Scanner scan1 = new Scanner(System.in);
        double expense2 = 0;
        do {
            System.out.println("Enter the value of new expenses for " + categories.Utilities + " category"); // Asking for new Utilities expense
            System.out.println("Enter 0 to exit");
            expense2 = scan1.nextDouble();
            expenseArr.add(expense2);
            UtilitiesExpense = UtilitiesExpense + expense2 ; // calculating total Rent and Utilities expenses
            System.out.println("Total expenses of this month for " + categories.Utilities + " category are: " + UtilitiesExpense);
        }
        while (expense2 != 0);
        return UtilitiesExpense;
    }


    public static double EntertainmentExpense = 0; // Global variable to store Total Entertainment Expenses
    // EntertainmentExpenses() function
    // EntertainmentExpenses() function is used for all the calculations related to Entertainment category.
    public static double EntertainemtExpenses(){
        Scanner scan1 = new Scanner(System.in);
        double expense3 = 0;
        do {
            System.out.println("Enter the value of new expenses for " + categories.Entertainment + " category"); // Asking for new Entertainment expense
            System.out.println("Enter 0 to exit");
            expense3 = scan1.nextDouble();
            expenseArr.add(expense3);
            EntertainmentExpense = EntertainmentExpense + expense3 ; // calculating total Entertainment expenses
            System.out.println("Total expenses of this month for " + categories.Entertainment + " category are: " + EntertainmentExpense);
        }
        while (expense3 != 0);
        return EntertainmentExpense;
    }


    public static double MiscExpense = 0; // Global variable to store Total Misc. Expenses
    // MiscExpenses() function
    // MiscExpenses() function is used for all the calculations related to Misc. category.

    public static double MiscExpense()
    {
        Scanner scan1 = new Scanner(System.in);
        double expense4 = 0;
        do {
            System.out.println("Enter the value of new expenses for " + categories.Miscellaneous + " category"); // Asking for new Misc. expense
            System.out.println("Enter 0 to exit");
            expense4 = scan1.nextDouble();
            expenseArr.add(expense4);
            MiscExpense = MiscExpense + expense4 ; // calculating total Misc. expenses
            System.out.println("Total expenses of this month for " + categories.Miscellaneous + " category are: " + MiscExpense);

        }while (expense4 != 0);
        return MiscExpense;
    }

    // expensesCalc() function
    // expensesCalc() function is the function used to do all the calculations related to expenses.
    // expensesCalc() function is used to add new expenses and also updates User's total expenses everytime user add any expenses.
    // expensesCalc() function also provides flexibility to specify the user's expenses into 4 categories and user can also calculate how much he/she spent on that particular category.
    public static void expensesCalc() {
        Scanner scan = new Scanner(System.in);
        boolean loopvar = true;

        while (loopvar)
        {
            System.out.println("Choose the Category");
            System.out.println("Enter 1 for Food");
            System.out.println("Enter 2 for Rent and Utilities");
            System.out.println("Enter 3 for Entertainment");
            System.out.println("Enter 4 for Miscellaneous");
            System.out.println("Enter 5 to Exit\n");
            final int c1 = 1,c2 = 2,c3 = 3,c4 = 4,c5 = 5;
            int choice; // Variable used to store the choice of the User.
            choice = scan.nextInt();
            if (Objects.equals(choice, c1))
            {
                category = "Food";
                System.out.println("Category : " + category);
                FoodExpenses(); // Calling FoodExpenses() function for further calculations
            }
            else if (Objects.equals(choice, c2))
            {
                category = "Rent and Utilities";
                System.out.println("Category : " + category);
                UtilitiesExpenses(); // Calling UtilitiesExpenses() function for further calculations
            }
            else if (Objects.equals(choice, c3))
            {
                category = "Entertainment";
                System.out.println("Category : " + category);
                EntertainemtExpenses(); // Calling EntertainmentExpenses() function for further calculations
            }
            else if (Objects.equals(choice, c4))
            {
                category = "Miscellaneous";
                System.out.println("Category : " + category);
                MiscExpense(); // Calling MiscExpenses() function for further calculations
            }
            else if (Objects.equals(choice, c5))
            {
                loopvar = false; // Terminates the function
            }
        }
    }
}
