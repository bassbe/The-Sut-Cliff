import java.util.Scanner;
//=============================================================================
public class NestedIf {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double WALKING_DISTANCE = 2.5;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char haveCar;
        double fromUS1;

        System.out.print("Do you have a car? : ");
        haveCar = Character.toUpperCase(keyboard.nextLine().charAt(0));

        if (haveCar == 'Y') {
            System.out.println("You can drive to campus");
        } else {
            System.out.print("How far do you live from US1? : ");
            fromUS1 = keyboard.nextDouble();
            if (fromUS1 > WALKING_DISTANCE) {
                System.out.println("Take the bus to US1");
            }
            System.out.println("Take the metrorail to campus");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================