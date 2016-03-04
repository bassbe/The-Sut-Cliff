import java.util.Scanner;
//=============================================================================
public class StringBufferX {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myName;
        StringBuffer myMutableName;
        int index;
        char letter;

        System.out.print("What is your name : ");
        myName = keyboard.nextLine();
        myMutableName = new StringBuffer(myName);

        for (index = 0; index < myMutableName.length(); index++) {
            letter = Character.toUpperCase(myMutableName.charAt(index));
            if (letter == 'A' || letter == 'E' || letter == 'I' ||
letter == 'O' || letter == 'U') {
                myMutableName.setCharAt(index,'X');
            }
        }

        System.out.println("My name is     " + myName);
        System.out.println("My mutation is " + myMutableName);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================