import java.util.Scanner;
//=============================================================================
public class Switch {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double DEFAULT_LABTASK_MAX_MARK = 2.0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int labtaskNumber;
        double maxMark, yourMark;

//----Initialize marks to default values
        maxMark = DEFAULT_LABTASK_MAX_MARK;
        yourMark = 0.0;
//----Prompt user for labtask number
        System.out.print("Enter labtask number in the range 1 to 4 : ");
        labtaskNumber = keyboard.nextInt();

        switch (labtaskNumber) {
            case 1:
                System.out.println("Directories, editing, and Java");
                yourMark = 2.0;
                break;
            case 2:
                System.out.println("Killing Kangaroos");
                maxMark = 3.0;
                System.out.print("Enter your mark out of " + maxMark + " : ");
                yourMark = keyboard.nextDouble();
                break;
            case 3:
                System.out.println("Nitrox SCUBA");
                System.out.print("Enter your mark out of " + maxMark + " : ");
                yourMark = keyboard.nextDouble();
                break;
            case 4:
                System.out.println("Driving up the I95");
                break;
        }

        System.out.println("You got " + 100.0 * yourMark/maxMark + "%");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================