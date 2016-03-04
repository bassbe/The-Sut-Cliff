import java.util.Scanner;
//=============================================================================
public class StringBufferMake {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final String SENTINEL = "STOP";
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myWord;
        StringBuffer mySentence;
        int index;

        mySentence = new StringBuffer("");

        System.out.print("Enter a word : ");
        myWord = keyboard.next();
        while (! myWord.equalsIgnoreCase(SENTINEL)) {
            mySentence.append(myWord + " ");
            System.out.print("Enter a word : ");
            myWord = keyboard.next();
        }
        System.out.println("The base sentence is " + mySentence);

        index = mySentence.indexOf("great");
        if (index >= 0) {
            mySentence.insert(index,"really ");
        }
        System.out.println("The emphasized sentence is " + mySentence);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================