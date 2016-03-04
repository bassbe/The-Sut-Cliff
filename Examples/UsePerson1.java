import java.util.Scanner;
//=============================================================================
public class UsePerson1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Person1 harry,sally,chris;

        harry = new Person1("Harry");
        System.out.println(harry);
        sally = new Person1("Sally");
        System.out.println(sally);
        keyboard.nextLine();

        System.out.println("Harry met Sally");
        harry.setLoveInterest(sally);
        sally.setLoveInterest(harry);
        System.out.println(harry);
        System.out.println(sally);
        keyboard.nextLine();

        System.out.println("Along came Chris, and ... a love triangle");
        chris = new Person1("Chris");
        chris.setLoveInterest(harry);
        sally.setLoveInterest(chris);
        System.out.println(harry);
        System.out.println(sally);
        System.out.println(chris);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
