import java.util.Scanner;
//=============================================================================
public class MethodCallMethod {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double INTEREST_RATE = 0.05;
    private static final double INTEREST_TAX = 0.02;
    private static final double BALANCE_TAX = 0.003;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold bank balance and interest
        double balance;
        double interest;

//----Get data
        System.out.print("What is the balance : ");
        balance = keyboard.nextDouble();

//----Compute interest
        interest = computeInterest(balance);

//----Display the information
        displayStatement(balance,interest);
    }
//-----------------------------------------------------------------------------
    private static double computeInterest(double currentBalance) {

        double baseInterest,taxToRemove,finalInterest;

        baseInterest = computeBaseInterest(currentBalance);
        taxToRemove = computeBankTax(baseInterest,currentBalance);
        finalInterest = baseInterest - taxToRemove;

        return(finalInterest);
    }
//-----------------------------------------------------------------------------
    private static double computeBaseInterest(double currentBalance) {

        return(currentBalance * INTEREST_RATE);
    }
//-----------------------------------------------------------------------------
    private static double computeBankTax(double interest,double balance) {

        double taxOnInterest,taxOnBalance,finalTax;

        taxOnInterest = INTEREST_TAX * interest;
        taxOnBalance = BALANCE_TAX * balance;
        finalTax = taxOnInterest + taxOnBalance;

        return(finalTax);
    }
//-----------------------------------------------------------------------------
    private static void displayStatement(double balance,double interest) {

        System.out.println("Your balance is          : $" + balance);
        System.out.println("Your interest is         : $" + interest);
        System.out.println("Your new balance will be : $" + 
(balance + interest));

    }
//-----------------------------------------------------------------------------
}
//=============================================================================