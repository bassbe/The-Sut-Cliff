import java.util.Scanner;
//=============================================================================
public class DoWhileInput {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char response;

        do {
            System.out.print("Do you love Java? : ");
            response = Character.toUpperCase(keyboard.nextLine().charAt(0));
        } while (response != 'Y');

        System.out.println("Good dog, good dog");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================