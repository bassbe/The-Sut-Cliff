import java.util.Scanner;
//=============================================================================
public class StringImmut {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String mySentence;
        String myUppercaseSentence;

        System.out.print("Enter a sentence : ");
        mySentence = keyboard.nextLine();
        System.out.println("The original is    : " + mySentence);

        myUppercaseSentence = mySentence.toUpperCase();
        System.out.println("The raised one is  : " + myUppercaseSentence);

        mySentence.toUpperCase();
        System.out.println("Wasted effort is   : " + mySentence);

        mySentence = mySentence.toUpperCase();
        System.out.println("The raised is    : " + mySentence);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================