import java.util.Scanner;
//=============================================================================
public class StringJavas {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final String SENTINEL = "STOP";
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myWord;
        String mySentence = "";
        int javas;

        javas = 0;

        do {
            System.out.print("Enter a word : ");
            myWord = keyboard.next();
            if (myWord.equals("Java")) {
                javas++;
            }
            if (! myWord.equalsIgnoreCase(SENTINEL)) {
                mySentence += " " + myWord;
            }
        } while (! myWord.equalsIgnoreCase(SENTINEL));

        System.out.println("\"" + mySentence + "\" has " + javas + " Javas");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================