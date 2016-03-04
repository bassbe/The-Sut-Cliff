import java.util.Scanner;
//=============================================================================
public class IfElse {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double area;
        long numberOfPeople;
        double populationDensity;

        System.out.print(
"What is the land area, and how many people live there? : ");
        area = keyboard.nextDouble();
        numberOfPeople = keyboard.nextLong();

        if (area <= 0 || numberOfPeople < 0) {
            System.out.println("ERROR: Invalid input");
        } else {
            populationDensity = numberOfPeople / area;
            System.out.println("That's a population density of " +
populationDensity + " per square mile");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================