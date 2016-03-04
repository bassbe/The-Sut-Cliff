import java.util.Scanner;
//=============================================================================
public class CheckbookByDesign {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold account and transaction information
        double startingBalance,endingBalance;
        char transactionType = ' ';
        double transactionAmount;

//----Get information
        System.out.print("What is the starting balance : ");
        startingBalance = keyboard.nextDouble();
        keyboard.nextLine();
        do {
            System.out.print("Enter the transaction type (W or D) : ");
            transactionType = keyboard.nextLine().charAt(0);
        } while (transactionType != 'W' && transactionType != 'D');
        System.out.print("Enter the transaction amount        : ");
        transactionAmount = keyboard.nextDouble();

//----Perform computations
        endingBalance = doTransaction(startingBalance,transactionType,
transactionAmount);

//----Display results
        displayResults(startingBalance,transactionType,transactionAmount,
endingBalance);
    }
//-----------------------------------------------------------------------------
    private static double doTransaction(double balance,char type,
double amount) {

//----If withdrawal subtract transaction amount from balance
        if (type == 'W') {
            amount = -amount;
        }

        if (balance + amount >= 0.0) {
            return(balance + amount);
        } else {
            System.out.println("You don't have enough money");
            return(balance);
        }
    }
//-----------------------------------------------------------------------------
    private static void displayResults(double startingBalance,
char transactionType,double transactionAmount,double endingBalance) {

//----Display starting balance
        System.out.println("Balance is $" + startingBalance);
//----Display transaction
        displayTransaction(transactionType,transactionAmount);
//----Display ending balance
        System.out.println("Balance is $" + endingBalance);
    }
//-----------------------------------------------------------------------------
    private static void displayTransaction(char type,double amount) {

        switch (type) {
            case 'W':
                System.out.print("Withdrawal");
                break;
            case 'D':
                System.out.print("Deposit");
                break;
            default:
                System.out.print("No transaction");
                break;
        }

        System.out.println(" $" + amount);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================