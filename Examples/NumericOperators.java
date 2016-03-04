import java.util.Scanner;
//=============================================================================
public class NumericOperators {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double BASE_COST = 100000;
    private static final double FLOOR_COST = 5000;
    private static final double ODD_FLOOR_SURCHARGE = 10000;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int floor;
        double apartmentPrice;

        System.out.print("What floor do you want to live on? : ");
        floor = keyboard.nextInt();

        apartmentPrice = BASE_COST + (floor * FLOOR_COST);
        apartmentPrice += (floor % 2) * ODD_FLOOR_SURCHARGE;
        System.out.println("Floor " + floor + " will cost you $" + 
apartmentPrice);

        floor++;
        apartmentPrice = BASE_COST + (floor * FLOOR_COST);
        apartmentPrice += (floor % 2) * ODD_FLOOR_SURCHARGE;
        System.out.println("Floor " + floor + " will cost you $" + 
apartmentPrice);

        System.out.println();
        System.out.println("This floor is     " + floor);
        System.out.println("The next floor is " + (++floor));
        System.out.println("The same floor is " + (floor++));
        System.out.println("The last floor is " + floor);
        
    }
//-----------------------------------------------------------------------------
}
//=============================================================================