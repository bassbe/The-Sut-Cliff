import java.util.Scanner;
//=============================================================================
public class StringMethod {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myPrompt = "What is your name : ";
        String response;

        response = readUserData(myPrompt);
        System.out.println("The user's response is \"" + response + "\"");
    }
//-----------------------------------------------------------------------------
    private static String readUserData(String prompt) {

        String userInput;

        System.out.print(prompt);
        userInput = keyboard.next();

        return(userInput);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================