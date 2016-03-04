import java.util.Scanner;
//=============================================================================
public class ConvertSafely {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int index;
        int intValue;
        int total;
        double doubleValue;
        String myInput;

        total = 0;
        for (index = 0; index < args.length; index++) {
            try {
                intValue = Integer.parseInt(args[index]);
                System.out.println(index + " : " + intValue);
                total += intValue;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " is not an integer");
            }
        }
        System.out.println("The total is " + total);

        System.out.print("Please enter a real number : ");
        myInput = keyboard.next();
        try {
            doubleValue = Double.parseDouble(myInput);
            System.out.println("The value is " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is not a double");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
