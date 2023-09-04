package budgetoproject2;

import java.util.ArrayList;
import java.util.Scanner;

public class savings {
    public static ArrayList<Double> savingArr = new ArrayList<Double>();
    protected static double totalSavings;

    public static double savingsCalc() {
        Scanner scan = new Scanner(System.in);
        double savings = 0;
        do {
            System.out.println("Enter the value of new saving: ");
            System.out.println("Enter 0 to exit");
            savings = scan.nextDouble();
            savingArr.add(savings);
            totalSavings += savings;
            System.out.println("Total savings of this month are: " + totalSavings);
        } while (savings != 0);
        return totalSavings;
    }
}

