import java.util.Scanner;
//=============================================================================
public class StringWords {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String mySentence;
        int index;
        boolean inWord;
        int words;

        System.out.print("Enter a sentence : ");
        mySentence = keyboard.nextLine();

        inWord = false;
        words = 0;
        for (index = 0; index < mySentence.length(); index++) {
            if (mySentence.charAt(index) == ' ') {
                inWord = false;
            } else {
                if (! inWord) {
                    inWord = true;
                    ++words;
                }
            }
        }

        System.out.println("\"" + mySentence + "\" has " + words + " words");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================