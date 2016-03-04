import java.util.Scanner;
//=============================================================================
public class SwitchDefault {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int valueMealNumber;

        System.out.print("Please enter value meal number, 1 to 3 : ");
        valueMealNumber = keyboard.nextInt();

        switch (valueMealNumber) {
            case 1:
                System.out.println("BigMac, fries, coke");
                break;
            case 2:
                System.out.println("Nuggets, onion rings, coke");
                break;
            case 3:
                System.out.println("McMuffin, cookie, milk");
                break;
            default:
                System.out.println(
"Invalid, so you get a 1/4 pounder with fries, and incorrect change");
                break;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================