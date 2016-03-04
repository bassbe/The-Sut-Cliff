import java.util.Scanner;
//=============================================================================
public class Conditional {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double HIGH_TAX_RATE = 0.3;
    private static final double LOW_TAX_RATE = 0.2;
    private static final double THRESHOLD = 100000.0;
    private static final double CHILD_DEDUCTION = 10000.0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double income,taxRate;
        int numberOfChildren;
        double taxableIncome;
        double taxToPay;

        System.out.print("Enter your income : ");
        income = keyboard.nextDouble();
        taxRate = income > THRESHOLD ? HIGH_TAX_RATE : LOW_TAX_RATE;

        System.out.print("How many children : ");
        numberOfChildren = keyboard.nextInt();

        taxableIncome = income - numberOfChildren * CHILD_DEDUCTION;
        taxToPay = taxableIncome * taxRate;

        System.out.println("Your income is      $" + income);
        System.out.println("You have " + numberOfChildren + " " +
(numberOfChildren == 1 ? "child" : "children"));
        System.out.println("Taxable income is   $" + taxableIncome);
        System.out.println("You must pay tax    $" + taxToPay);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================