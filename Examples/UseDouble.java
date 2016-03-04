import java.util.Scanner;
//=============================================================================
public class UseDouble {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double rawDouble;
        Double wrappedDouble;
        double copyDouble;
        String stringDouble;

        System.out.print("Enter a double : ");
        rawDouble = keyboard.nextDouble();
        wrappedDouble = new Double(rawDouble);
        System.out.println("Raw double              = " + rawDouble);
        System.out.println("Wrapped double          = " + wrappedDouble);
        copyDouble = wrappedDouble.doubleValue();
        System.out.println("Unwrapped double        = " + copyDouble);

        keyboard.nextLine();
        System.out.print("Enter a double : ");
        stringDouble = keyboard.nextLine();
        rawDouble = Double.parseDouble(stringDouble);
        wrappedDouble = Double.valueOf(stringDouble);
        System.out.println("String double           = " + stringDouble);
        System.out.println("Raw double              = " + rawDouble);
        System.out.println("Wrapped double          = " + wrappedDouble);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
