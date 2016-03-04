import java.util.Scanner;
//=============================================================================
public class ShortCircuit {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double CUT_AFTER_HEIGHT = 100.0;
    private static final int CUT_ROTTING_FROM_AGE = 50;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double treeHeight;
        int treeAge;
        boolean rotting;
        boolean cutItDown;

        System.out.print("Please enter the tree height and age : ");
        treeHeight = keyboard.nextDouble();
        treeAge = keyboard.nextInt();
        System.out.print("Is the tree rotting (true/false)     : ");
        rotting = keyboard.nextBoolean();

        cutItDown = (treeHeight > CUT_AFTER_HEIGHT) || 
(rotting && (treeAge >= CUT_ROTTING_FROM_AGE));
        System.out.println("Get out the chain saw ... " + cutItDown);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================