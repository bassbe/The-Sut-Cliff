import java.util.Scanner;
//=============================================================================
public class ExceptionArray {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData = new int[DATA_SIZE];
        int index;
        int data;
        int userIndex;

        do {
            System.out.print("Enter index and positive data value : ");
            userIndex = keyboard.nextInt();
            data = keyboard.nextInt();
            if (data > 0) {
                myData[userIndex] = data;
            }
        } while (data > 0);

        for (index = 0; index < myData.length; index++) {
             System.out.println(index + " = " + myData[index]);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
