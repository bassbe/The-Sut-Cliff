import java.util.Scanner;
//=============================================================================
public class SwitchFall {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int monthNumber;
        int year;

        System.out.print("Enter month and year : ");
        monthNumber = keyboard.nextInt();
        year = keyboard.nextInt();

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if (year % 4 ==  0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================