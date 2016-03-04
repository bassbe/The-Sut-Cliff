import java.util.*;
//=============================================================================
public class ExceptionArray2CaughtGeneric {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData = null;
        int size;
        int index;
        int data;
        int userIndex;

        try {
            System.out.print("How many items of data : ");
            size = keyboard.nextInt();
            myData = new int[size];
            do {
                System.out.print("Enter index and positive data value : ");
                userIndex = keyboard.nextInt();
                data = keyboard.nextInt();
                if (data > 0) {
                    myData[userIndex] = data;
                }
            } while (data > 0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " caused an exception");
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
}
//=============================================================================
