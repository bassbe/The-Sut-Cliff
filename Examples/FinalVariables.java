import java.util.Scanner;
//=============================================================================
public class FinalVariables {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    public static final double OBJECTS_PER_MOLE = 6.022E23;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        final int percentage;

        System.out.print("Enter percentage (get it right - it's final): ");
        percentage = keyboard.nextInt();

        System.out.println("The percentage is " + percentage);
/*----The compiler will not allow this
        percentage = 99;
        System.out.println("The percentage is " + percentage);
----*/

        System.out.println("(and BTW, Avagadro's number is " +
OBJECTS_PER_MOLE + ")");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================