import java.util.Scanner;
//=============================================================================
public class ASCIITranslate {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int number;
        char character;

        System.out.print("Enter a character : ");
        character = keyboard.nextLine().charAt(0);
        System.out.println("The integer for " + character + " is " +
(int)character);

        System.out.print("Enter an integer  : ");
        number = keyboard.nextInt();
        System.out.println("The character for " + number + " is ---" +
(char)number + "---");

    }
//-----------------------------------------------------------------------------
}
//=============================================================================