import java.util.Scanner;
//=============================================================================
public class BankAccount1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static double totalDeposits = 0.0;
    private static double totalWithdrawals = 0.0;
//-----------------------------------------------------------------------------
    private String name;
    private double balance;
//-----------------------------------------------------------------------------
    public static void displayBanking() {

        System.out.printf("\n$%.2f deposits and $%.2f withdrawals\n",
totalDeposits,totalWithdrawals);

    }
//-----------------------------------------------------------------------------
    public BankAccount1() {

        name = "";
        balance = 0.0;
    }
//-----------------------------------------------------------------------------
    public BankAccount1(String newName,double initialBalance) {

        name = newName;
        balance = initialBalance;
    }
//-----------------------------------------------------------------------------
    public String toString() {

        return(String.format("%s has $%.2f",name,balance));
    }
//-----------------------------------------------------------------------------
    public void doTransaction(char type,double amount) {

        switch (type) {
            case 'D':
                System.out.printf("%s deposits $%.2f\n",name,amount);
                balance += amount;
                totalDeposits += amount;
                break;
            case 'W':
                if (balance - amount >= 0.0) {
                    System.out.printf("%s withdraws $%.2f\n",name,amount);
                    balance -= amount;
                    totalWithdrawals += amount;
                } else {
                    System.out.printf("%s cannot withdraw $%.2f\n",name,
amount);
                }
                break;
            default:
                System.out.println (type + "is an invalid transaction type");
                break;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================