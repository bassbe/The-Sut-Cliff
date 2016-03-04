import java.util.Scanner;
//=============================================================================
public class MatchingElse {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        boolean canPayFine,needReceipt;

        System.out.print("Can you pay your parking fine? (true/false) : ");
        canPayFine = keyboard.nextBoolean();
        if (canPayFine) {
            System.out.print("Do you need a receipt? (true/false) : ");
            needReceipt = keyboard.nextBoolean();
        } else {
            needReceipt = false;
        }

        System.out.println();
        System.out.println("In a bad programmer's world ...");
        if (canPayFine) 
            if (needReceipt)
                System.out.println("Thanks for paying your parking ticket");
        else
            System.out.println("Send to jail, for so many years!");

        System.out.println();
        System.out.println("In a good programmer's world ...");
        if (canPayFine) {
            if (needReceipt) {
                System.out.println("Thanks for paying your parking ticket");
            }
        } else {
            System.out.println("Send to jail, for so many years!");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================