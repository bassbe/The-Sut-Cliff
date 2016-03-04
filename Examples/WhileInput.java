import java.util.Scanner;
//=============================================================================
public class WhileInput {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int MAXIMUM_AGE = 130;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int age;

        System.out.print("Enter your age (between 0 and " + MAXIMUM_AGE + 
") : ");
        age = keyboard.nextInt();

        while (age < 0 || age > MAXIMUM_AGE) {
            System.out.print("Please try again : ");
            age = keyboard.nextInt();
        }

        switch (age / 25) {
            case 0:
                System.out.println(age + " is young");
                break;
            case 1:
                System.out.println(age + " is middle aged");
                break;
            case 2:
                System.out.println(age + " is old");
                break;
            case 3:
                System.out.println(age + " is impressive");
                break;
            default:
                System.out.println(age + " is like Peter Pan");
                break;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================