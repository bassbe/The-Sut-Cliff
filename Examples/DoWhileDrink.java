import java.util.Scanner;
//=============================================================================
public class DoWhileDrink {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int stability = 10;
        char choice;

        do {
            System.out.println("Yes sir (stability " + stability + 
"), what can I get you");
            do {
                System.out.print("(B)eer, (R)um, or (S)oda : ");
                choice = Character.toUpperCase(keyboard.nextLine().charAt(0));
            } while (choice != 'B' && choice != 'R' && choice != 'S');

            switch (choice) {
                case 'B':
                    stability -= 2;
                    break;
                case 'R':
                    stability -= 3;
                    break;
                case 'S':
                    break;
                default:
                    System.out.println("Report this to the developer");
                    break;
            }

        } while (stability > 0);

        System.out.println("Time to go home");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================