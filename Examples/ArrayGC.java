import java.util.Scanner;
//=============================================================================
public class ArrayGC {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_ITEMS = 4;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData;
        int index;

        myData = new int[DATA_ITEMS];
        for (index = 0; index < myData.length; index++) {
            System.out.print("Please enter integer " + index + " : ");
            myData[index] = keyboard.nextInt();
        }

        myData = new int[DATA_ITEMS + 2];
        for (index = 0; index < myData.length; index++) {
            System.out.println("Integer " + index + " is " + myData[index]);
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================