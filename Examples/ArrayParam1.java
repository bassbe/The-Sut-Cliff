import java.util.Scanner;
//=============================================================================
public class ArrayParam1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double userValues[];
        int numberOfUserValues;

        System.out.print("How many values to store? : ");
        numberOfUserValues = keyboard.nextInt();
        userValues = new double[numberOfUserValues];

        inputUserValues(userValues);
        displayUserValues(userValues);

    }
//-----------------------------------------------------------------------------
    private static void inputUserValues(double[] theArray) {

        int index;

        for (index = 0; index < theArray.length; index++) {
            System.out.print("Enter value for index " + index + " : ");
            theArray[index] = keyboard.nextDouble();
        }

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