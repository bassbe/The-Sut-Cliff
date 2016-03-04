import java.util.Scanner;
//=============================================================================
public class IfReturn {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int GENTLE_WIND = 10;
    private static final int STRONG_WIND = 25;
    private static final int LARGE_SAIL = 150;
    private static final int MEDIUM_SAIL = 120;
    private static final int SMALL_SAIL = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int sailSize,newSailSize;
        int windSpeed;

        System.out.print("What is the wind speed now?  : ");
        windSpeed = keyboard.nextInt();
        sailSize = selectSail(windSpeed);
        System.out.println("Off you go with the "+ sailSize + " sail");

        System.out.print("What is the wind speed now?  : ");
        windSpeed = keyboard.nextInt();
        if (windSpeed > STRONG_WIND && sailSize == LARGE_SAIL) {
            System.out.println("Help, we're in trouble!");
            return;
        } else {
            newSailSize = selectSail(windSpeed);
            if (newSailSize != sailSize) {
                System.out.println("Change the sail to the " + newSailSize);
            }
        }
        System.out.println("Another great day on Biscayne Bay!");
    }
//-----------------------------------------------------------------------------
    private static int selectSail(int windSpeed) {

        if (windSpeed <= GENTLE_WIND) {
            return(LARGE_SAIL);
        } else if (windSpeed <= STRONG_WIND) {
            return(MEDIUM_SAIL);
        } else {
            return(SMALL_SAIL);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================