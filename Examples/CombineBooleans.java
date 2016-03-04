import java.util.Scanner;
//=============================================================================
public class CombineBooleans {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double GOOD_UNDERSTANDER = 70.0;
    private static final double GOOD_PROGRAMMER = 80.0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double examPercent,programmingPercent;
        boolean goodUnderstander,goodProgrammer;
        boolean goodAtBoth,goodAtOne,useless;

        System.out.print("Please enter exam and programming percentage : ");
        examPercent = keyboard.nextDouble();
        programmingPercent = keyboard.nextDouble();

        goodUnderstander = examPercent > GOOD_UNDERSTANDER;
        goodProgrammer = programmingPercent > GOOD_PROGRAMMER;
        System.out.println("Good understander  : " + goodUnderstander);
        System.out.println("Good programmer    : " + goodProgrammer);

        goodAtBoth = goodUnderstander && goodProgrammer;
        goodAtOne = (goodUnderstander || goodProgrammer) && !goodAtBoth;
//----  goodAtOne = goodUnderstander != goodProgrammer;
        useless = !goodUnderstander && !goodProgrammer;

        System.out.println("Good at both       : " + goodAtBoth);
        System.out.println("Good for something : " + goodAtOne);
        System.out.println("Useless            : " + useless);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================