import java.util.*;
//=============================================================================
public class ExceptionArray2CaughtUp {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData;
        int index;

        try {
            myData = inputData();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Could not input data");
            myData = null;
        }

        if (myData != null) {
            for (index = 0; index < myData.length; index++) {
                System.out.println(index + " = " + myData[index]);
            }
        } else {
            System.out.println("No data was stored");
        }
    }
//-----------------------------------------------------------------------------
    private static int[] inputData() 
throws NegativeArraySizeException, InputMismatchException {

        int[] theData;
        int size;
        int data;
        int userIndex;

        System.out.print("How many items of data : ");
        size = keyboard.nextInt();
        theData = new int[size];
        do {
            System.out.print("Enter index and positive data value : ");
            userIndex = keyboard.nextInt();
            data = keyboard.nextInt();
            if (data > 0) {
                try {
                    theData[userIndex] = data;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage() + " is an invalid index");
                }
            }
        } while (data > 0);

        return(theData);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
