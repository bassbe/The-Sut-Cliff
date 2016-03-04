import java.util.Scanner;
//=============================================================================
public class ArrayNULL {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        long[] myVector = null;
        int vectorLength;

        if (myVector == null) {
            System.out.println("Initially it is null");
        } else {
            System.out.println("Initially it has length " + myVector.length);
        }

        System.out.print("How many data items : ");
        vectorLength = keyboard.nextInt();
        myVector = new long[vectorLength];

        if (myVector == null) {
            System.out.println("After creation it is null");
        } else {
            System.out.println("After creation it has length " + 
myVector.length);
        }

        myVector = null;

        if (myVector == null) {
            System.out.println("After nullification it is null");
        } else {
            System.out.println("After nullification it has length " + 
myVector.length);
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================