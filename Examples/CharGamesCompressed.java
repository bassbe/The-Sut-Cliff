import java.util.Scanner;
//=============================================================================
public class CharGamesCompressed {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char firstInitial,familyInitial;

        System.out.print("Please enter your two initials : ");
        firstInitial = Character.toUpperCase(keyboard.next().charAt(0));
        familyInitial = Character.toUpperCase(keyboard.next().charAt(0));

        System.out.println("Your initials are " + firstInitial + "." +
familyInitial + ".");
        System.out.println("It is " + (Character.isLetter(firstInitial) &&
Character.isLetter(familyInitial)) + " that they are both letters");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================