import java.util.Scanner;
//=============================================================================
public class UseBankAccount1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        BankAccount1 geoffsAccount = new BankAccount1("Geoff",1000);
        BankAccount1 billsAccount = new BankAccount1("Bill",1000000);

        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(billsAccount);
        billsAccount.doTransaction('W',5000);
        System.out.println(billsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(geoffsAccount);
        geoffsAccount.doTransaction('W',600);
        System.out.println(geoffsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(geoffsAccount);
        geoffsAccount.doTransaction('W',250);
        System.out.println(geoffsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(billsAccount);
        billsAccount.doTransaction('D',500000);
        System.out.println(billsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(geoffsAccount);
        geoffsAccount.doTransaction('D',175);
        System.out.println(geoffsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

        System.out.println(geoffsAccount);
        geoffsAccount.doTransaction('W',3000);
        System.out.println(geoffsAccount);
        BankAccount1.displayBanking();
        keyboard.nextLine();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================