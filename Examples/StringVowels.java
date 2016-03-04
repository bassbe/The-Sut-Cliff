import java.util.Scanner;
//=============================================================================
public class StringVowels {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myName;
        int index;
        char letter;
        int vowels;

        System.out.print("What is your name : ");
        myName = keyboard.nextLine();

        vowels = 0;
        for (index = 0; index < myName.length(); index++) {
            letter = myName.charAt(index);
            letter = Character.toUpperCase(letter);
            if (letter == 'A' || letter == 'E' || letter == 'I' ||
letter == 'O' || letter == 'U') {
                vowels++;
            }
        }

        System.out.println(myName + " has " + vowels + " vowels");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================


//the plus sign mean concatenate.