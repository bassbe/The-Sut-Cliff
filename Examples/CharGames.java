import java.util.Scanner;
//=============================================================================
public class CharGames {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char firstInitial,familyInitial;
        boolean normalInitials;

        System.out.print("Please your two initials : ");
        firstInitial = keyboard.next().charAt(0);
        familyInitial = keyboard.next().charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        familyInitial = Character.toUpperCase(familyInitial);

        normalInitials = Character.isLetter(firstInitial) && 
Character.isLetter(familyInitial);

        System.out.println("Your initials are " + firstInitial + "." +
familyInitial + ".");
        System.out.println("It is " + normalInitials + 
" that they are both letters");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================