import java.util.Scanner;
//=============================================================================
public class StringVar3 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myFirstName;
        String myFamilyName;

        System.out.print("What is your first name : ");
        myFirstName = keyboard.next();

        System.out.print("Hi " + myFirstName + ", what is your family name : ");
        myFamilyName = keyboard.next();

        System.out.println("Hi " + myFirstName + " " + myFamilyName);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================