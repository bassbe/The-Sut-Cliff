import java.util.Scanner;
//=============================================================================
public class CheckbookInMain {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold account and transaction information
        double startingBalance,endingBalance;
        char transactionType = ' ';
        double transactionAmount;
        double changeAmount;

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
        if (transactionType == 'W') {
            changeAmount = -transactionAmount;
        } else {
            changeAmount = transactionAmount;
        }
        if (startingBalance + transactionAmount >= 0.0) {
            endingBalance = startingBalance + changeAmount;
        } else {
            System.out.println("You don't have enough money");
            endingBalance = startingBalance;
        }

//----Display results
//----Display starting balance
        System.out.println("Balance is $" + startingBalance);
//----Display transaction
        switch (transactionType) {
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
        System.out.println(" $" + transactionAmount);

//----Display ending balance
        System.out.println("Balance is $" + endingBalance);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================