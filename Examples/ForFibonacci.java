import java.util.Scanner;
//=============================================================================
public class ForFibonacci {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int whichNumber,index;
        long previous = 1;
        long current = 0;
        long next;

        do {
            System.out.print("Which Fibonacci number do you want : ");
            whichNumber = keyboard.nextInt();
        } while (whichNumber < 0);

        for (index = 0; index < whichNumber; index++) {
            next = current + previous;
            previous = current;
            current = next;
        }

        System.out.println("The " + whichNumber + "th Fibonacci number is " +
current);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================