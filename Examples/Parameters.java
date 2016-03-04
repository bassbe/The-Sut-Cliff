import java.util.Scanner;
//=============================================================================
public class Parameters {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double TAX_RATE = 0.15;
    private static final double TAX_FREE_PER_BOAT = 10000;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double beforeTaxIncome;
        int numberOfBoats;

        System.out.print("Enter your before tax income : ");
        beforeTaxIncome = keyboard.nextDouble();
        System.out.print("How many boats do you own    : ");
        numberOfBoats = keyboard.nextInt();
        computeTax(beforeTaxIncome,numberOfBoats);
        System.out.println("That's how much tax you'd pay on $" +
beforeTaxIncome + " if Geoff were king");

    }
//-----------------------------------------------------------------------------
    private static void computeTax(double income,int numberOfBoats) {

        double tax;

        System.out.println("Computing tax on " + income);
        income = income - numberOfBoats * TAX_FREE_PER_BOAT;
        System.out.println("After necessary expenses that's " + income);
        tax = income * TAX_RATE;
        System.out.println("Tax on $" + income + " is $" + tax);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================