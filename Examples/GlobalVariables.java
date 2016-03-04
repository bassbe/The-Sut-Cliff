import java.util.Scanner;
//=============================================================================
public class GlobalVariables {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static int numberOfWarts = 0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int numberOfWarts = 27;

//----Try to work out what this program prints out
        haveWarts();
        suffer(numberOfWarts);
        System.out.println("After treatment the situation changes ...");
        numberOfWarts = 1;
        suffer(numberOfWarts);
        numberOfWarts = wantWarts();
        suffer(numberOfWarts);

    }
//-----------------------------------------------------------------------------
    private static void haveWarts() {

        System.out.print("How many warts do you have : ");
        numberOfWarts = keyboard.nextInt();
    }
//-----------------------------------------------------------------------------
    private static void suffer(int numberOfWarts) {

        System.out.println("You suffer from " + numberOfWarts + " warts");
    }
//-----------------------------------------------------------------------------
    private static int wantWarts() {

        int numberOfWorts;

        System.out.print("How many warts would you like to have : ");
        numberOfWorts = keyboard.nextInt();
        return(numberOfWarts);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================