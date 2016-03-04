import java.util.Scanner;
//=============================================================================
public class ExceptionArrayCaught {
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
                try {
                    myData[userIndex] = data;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage() + " is an invalid index");
                }
            }
        } while (data > 0);

        for (index = 0; index < myData.length; index++) {
             System.out.println(index + " = " + myData[index]);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
