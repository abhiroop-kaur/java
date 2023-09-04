package budgetoproject2;

import java.util.Scanner;

public class tracker {
    private static boolean loopvar = true;
    public static double saving; 
    public static String name;
    public static double budget;

    public static void Menu() {
        Scanner scan = new Scanner(System.in);
        int choice;

        while (loopvar) {
            System.out.println("Enter 1 for ADDING NEW EXPENSE");
            System.out.println("Enter 2 for ADDING NEW SAVING");
            System.out.println("Enter 3 to DISPLAY FINANCIALS DETAILED");
            System.out.println("Enter 4 to DISPLAY SAVINGS DETAILED");
            System.out.println("Enter 5 to DISPLAY EXPENSES DETAILED");
            System.out.println("Enter 6 to EXIT");

            choice = scan.nextInt();
            if (choice == 1) {
                expenses expense = new expenses();
                expense.expensesCalc();
            } else if (choice == 2) {
                savings savings = new savings();
                savings.savingsCalc();
            } else if (choice == 3) {
                detailedFinancials detailedFinancials = new detailedFinancials();
            }else if(choice==4){
                detailedSavings();
            }else if (choice==5){
                detailedExpense detailedExpense =new detailedExpense();
            }
             else if (choice == 6) {
                loopvar = false;
                System.out.println("Exiting the budget tracker. Goodbye!");
            } else {
                System.out.println("Incorrect choice");
            }
        }
    }

    
    // Rest of the main method and input handling goes here
    /**
     * @param args
     */
    public static void intro(){
      System.out.println("Welcome to the Budget Tracker!");
        System.out.println("Please provide your information...");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scan.nextLine();
        System.out.print("Enter Monthly Income: ");
        double income = scan.nextDouble();
        System.out.print("Enter Monthly Budget: ");
        budget = scan.nextDouble();
        saving = income - budget;
        System.out.println("Detailed Financials:");
        System.out.println("User's Name: " + name);
        System.out.println("Monthly Income: " + income);
        System.out.println("Monthly Budget: " + budget);
        System.out.println("Targeted Monthly Savings: " + saving);
        
        // Initialize other variables or arrays here if needed
        
        System.out.println("Welcome, " + name + "!");
        System.out.println("Your Target Monthly Savings: " + saving);  
    }
    public static double saving1;
        public static double detailedSavings(){
            System.out.println(" Total savings are : " + savings.totalSavings); // Displaying Total savings
    
            if(saving >= savings.totalSavings)
            {
                saving1 = saving - savings.totalSavings;
                System.out.println("You have to save " + saving1 + " more to meet this month's targeted savings.\n");
            }
            else
            {
                saving1 = saving - savings.totalSavings;
                System.out.println("Congratulations !!!  You have surpassed " + -(saving1) + " more than your this month's targeted savings\n");
            }
            return saving1;
    
        }
     public static void main(String[] args) {
   
        // Initialize other variables or arrays here if needed
        intro();
        Menu(); // Start the main menu

        
    }
}


