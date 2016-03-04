import java.util.Scanner;
//=============================================================================
public class ExceptionThrow {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double CABER_TOSS_CONSTANT = 892.83;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double weightOfCaber;

        do {
            System.out.print("Enter weight of caber : ");
            weightOfCaber = keyboard.nextDouble();
            try {
                tossTheCaber(weightOfCaber);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

    }
//-----------------------------------------------------------------------------
    private static void tossTheCaber(double weight) 
throws IllegalArgumentException {

        int distance;

        if (weight <= 0) {
            throw(new IllegalArgumentException("Och aye, noo fairy cabers"));
        }

        distance = (int)(CABER_TOSS_CONSTANT / weight);
        if (distance == 0) {
            throw(new IllegalArgumentException("Aaargh, too bluddy heavey"));
        }

        System.out.println("Jock dus it, and toss da caber " + distance + 
" yards");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
