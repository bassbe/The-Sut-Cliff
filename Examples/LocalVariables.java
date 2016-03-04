import java.util.Scanner;
//=============================================================================
public class LocalVariables {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("Hello World!");
        doubleSomeInput();
        System.out.println("Goodbye World!");
    }
//-----------------------------------------------------------------------------
    private static void doubleSomeInput() {

        int inputNumber;
        int twiceThat;

        System.out.print("Enter an integer : ");
        inputNumber = keyboard.nextInt();
        twiceThat = 2 * inputNumber;
        System.out.println("Twice that is : " + twiceThat);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================