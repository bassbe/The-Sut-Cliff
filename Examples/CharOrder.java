import java.util.Scanner;
//=============================================================================
public class CharOrder {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char firstInitial,familyInitial;
        boolean initialsInOrder;

        System.out.print("Please enter your two initials : ");
        firstInitial = keyboard.next().charAt(0);
        familyInitial = keyboard.next().charAt(0);
        System.out.println(firstInitial + " is " + (int)firstInitial +
" and " + familyInitial + " is " + (int)familyInitial);

        initialsInOrder = firstInitial <= familyInitial;

        System.out.println("Vote for " + firstInitial + familyInitial +
": " + initialsInOrder);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================