import java.util.Scanner;
//=============================================================================
public class If {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double WHOPPER_COST = 1.85;
    private static final double COKE_COST = 0.65;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double moneyInPocket;

        System.out.print("How much money do you have? : ");
        moneyInPocket = keyboard.nextDouble();

        if (moneyInPocket >= (2 * WHOPPER_COST)) {
            System.out.println("Take a friend to BK!");
            moneyInPocket -= 2 * WHOPPER_COST;
            System.out.println("You now have $" + moneyInPocket);
        }

        if (moneyInPocket >= COKE_COST) {
            System.out.println("Buy yourself a Coke!");
            moneyInPocket -= COKE_COST;
            System.out.println("You now have $" + moneyInPocket);
        }

        if (moneyInPocket >= (WHOPPER_COST + COKE_COST)) {
            System.out.println("Buy an extra burger and Coke (for your mum)!");
            moneyInPocket -= WHOPPER_COST + COKE_COST;
            System.out.println("You now have $" + moneyInPocket);
        }

        if (moneyInPocket >= COKE_COST) {
            System.out.println("Buy your friend a Coke!");
            moneyInPocket -= COKE_COST;
            System.out.println("You now have $" + moneyInPocket);
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================