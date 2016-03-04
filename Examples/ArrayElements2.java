import java.util.Scanner;
//=============================================================================
public class ArrayElements2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double userValues[];
        int numberOfUserValues;
        int index;

        System.out.print("How many values to store? : ");
        numberOfUserValues = keyboard.nextInt();
        userValues = new double[numberOfUserValues];

        for (index = 0; index < numberOfUserValues; index++) {
            System.out.print("Enter value for index " + index + " : ");
            userValues[index] = keyboard.nextDouble();
        }

        for (index = 0; index < numberOfUserValues; index++) {
            System.out.println("Value at index " + index + " is " +
userValues[index]);
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================