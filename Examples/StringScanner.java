import java.util.Scanner;
//=============================================================================
public class StringScanner {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String inputFromScanner;
        int numericInputFromScanner;

        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.nextLine();
        System.out.println("The words are " + inputFromScanner + "\n");

        System.out.print("Please enter a word       : ");
        inputFromScanner = keyboard.next();
        System.out.println("The word is " + inputFromScanner);
        System.out.println("Reading the left over return");
        inputFromScanner = keyboard.nextLine();
        System.out.println("The junk is ==" + inputFromScanner + "==\n");

        System.out.print("Please enter another word : ");
        inputFromScanner = keyboard.next();                     //.next() only reads the next word
        System.out.println("The word is " + inputFromScanner);
        System.out.println("Ignoring the rest of the line\n");
        keyboard.nextLine();

        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.next();
        System.out.println("The first word is " + inputFromScanner);
        inputFromScanner = keyboard.next();
        System.out.println("The next word is " + inputFromScanner);
        System.out.println("Ignoring the rest of the line\n");
        keyboard.nextLine();

        System.out.print("Please enter an integer   : ");
        numericInputFromScanner = keyboard.nextInt();
        System.out.println("The integer is " + numericInputFromScanner);
        System.out.println("Ignoring the rest of the line\n");
        keyboard.nextLine(); // use it to wipe clean the return character when you read #'s and strings
    }
//-----------------------------------------------------------------------------
}
//=============================================================================