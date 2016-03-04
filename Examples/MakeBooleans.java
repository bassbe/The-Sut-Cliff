import java.util.Scanner;
//=============================================================================
public class MakeBooleans {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int number1,number2;
        boolean inOrder;
        boolean someBooleanValue;

        someBooleanValue = false;
        System.out.println("Some Boolean value is " + someBooleanValue);

        System.out.print("Please enter two integers : ");
        number1 = keyboard.nextInt();
        number2 = keyboard.nextInt();
        inOrder = number1 <= number2;
        System.out.println("It is " + inOrder + " that they are in order");

        System.out.println("It is " + (number1 == number2) +
" that they are equal");

    }
//-----------------------------------------------------------------------------
}
//=============================================================================