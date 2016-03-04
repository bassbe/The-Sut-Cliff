import java.util.Scanner;
//=============================================================================
public class ArrayParam2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double userValues[];
        int numberOfUserValues;

        userValues = inputUserValues();
        displayUserValues(userValues);

        System.out.println("And now all in one ...");
        displayUserValues(inputUserValues());

    }
//-----------------------------------------------------------------------------
    private static double[] inputUserValues() {

        int numberOfUserValues;
        double theArray[];
        int index;

        System.out.print("How many values to store? : ");
        numberOfUserValues = keyboard.nextInt();
        theArray = new double[numberOfUserValues];

        for (index = 0; index < theArray.length; index++) {
            System.out.print("Enter value for index " + index + " : ");
            theArray[index] = keyboard.nextDouble();
        }

        return(theArray);
    }
//-----------------------------------------------------------------------------
    private static void displayUserValues(double[] userValues) {

        int index;

        for (index = 0; index < userValues.length; index++) {
            System.out.println("Value at index " + index + " is " +
userValues[index]);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================