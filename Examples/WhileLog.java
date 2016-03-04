import java.util.Scanner;
//=============================================================================
public class WhileLog {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        long divided,startAt;
        int iterations = 0;

        System.out.print("What number should I start at : ");
        startAt = keyboard.nextLong();
        divided = startAt;
        
        while (divided >= 2) {
            iterations++;
            divided /= 2;
        }

        System.out.println("log2(" + startAt + ") is " + iterations);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================