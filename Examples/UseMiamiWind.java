import java.util.Scanner;
//=============================================================================
public class UseMiamiWind {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        MiamiWind today,tomorrow;
        int windStrength;
        String windDirection;

        today = new MiamiWind();
        System.out.println("Today the wind is " + today);

        System.out.println();
        System.out.print("What wind stength do you predict for tomorrow: ");
        windStrength = keyboard.nextInt();
        tomorrow = new MiamiWind(windStrength);
        System.out.println("Tomorrow the wind will be (default direction) " +
tomorrow);

        System.out.println();
        keyboard.nextLine();
        System.out.print("What wind direction do you predict for tomorrow: ");
        windDirection = keyboard.nextLine();
        tomorrow = new MiamiWind(windStrength,windDirection);
        System.out.println("Tomorrow the wind will be " + tomorrow);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================