import java.util.Scanner;
//=============================================================================
public class ExceptionArray2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData;
        int size;
        int index;
        int data;
        int userIndex;

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

        for (index = 0; index < myData.length; index++) {
             System.out.println(index + " = " + myData[index]);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
