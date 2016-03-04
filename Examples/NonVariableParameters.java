import java.util.Scanner;
//=============================================================================
public class NonVariableParameters {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double SCALING_FACTOR = 1.34;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double userValue;

        System.out.print("What value shall we play with? : ");
        userValue = keyboard.nextDouble();
        displayNicely(userValue);
        System.out.println("Now we'll scale it up");
        displayNicely(userValue * SCALING_FACTOR);
        System.out.println("Now we'll use my magic number");
        displayNicely(27 + 16 + 28);

    }
//-----------------------------------------------------------------------------
    private static void displayNicely(double value) {

        System.out.println("----------------------------------------");
        System.out.println("Your value is ...");
        System.out.println("    " + value);
        System.out.println("----------------------------------------");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================