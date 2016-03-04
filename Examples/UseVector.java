import java.util.*;
//=============================================================================
public class UseVector {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Vector someIntegers = new Vector();
        int userInput;
        Integer userInputObject;
        int index;

        do {
            System.out.println("The vector capacity is " + 
someIntegers.capacity() + " and the size is " + someIntegers.size());
            System.out.print("Enter an integer to store : ");
            userInput = keyboard.nextInt();
            userInputObject = new Integer(userInput);
            someIntegers.add(userInputObject);
        } while (userInput != 0);

        for (index = 0; index < someIntegers.size(); index++) {
            System.out.println("Item " + index + " is " + 
someIntegers.elementAt(index));
        }

        System.out.print("Enter an integer to find  : ");
        userInput = keyboard.nextInt();
        userInputObject = new Integer(userInput);
        if ((index = someIntegers.indexOf(userInputObject)) >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
