import java.util.Scanner;
//=============================================================================
public class LocalScope {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double WARMING_RATE = 1.05;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double averageTemperature;
        double nextYearsTemperature;
        double nextYearsTemperatureInTonga;

        System.out.print("What is the average temperature this year? ");
        averageTemperature = keyboard.nextDouble();
        nextYearsTemperature = averageTemperature * WARMING_RATE;
        nextYearsTemperatureInTonga = computeWarmthInTonga(averageTemperature);

        System.out.println("The average temperature is     " + 
averageTemperature);
        System.out.println("Generally next year it will be " + 
nextYearsTemperature);
        System.out.println("In Tonga next year it will be  " + 
nextYearsTemperatureInTonga);

    }
//-----------------------------------------------------------------------------
    private static double computeWarmthInTonga(double thisYearsTemperature) {

        final double WARMING_RATE = 1.01;

        return(thisYearsTemperature * WARMING_RATE);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================