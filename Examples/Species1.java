import java.util.Scanner;
//=============================================================================
public class Species1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    private String name;
    private int population;
    private double growthRate;
//-----------------------------------------------------------------------------
    public Species1() {

        name = "";
        population = 0;
        growthRate = 0.0;
    }
//-----------------------------------------------------------------------------
    public void readInput() {

        System.out.print("What is the species name?              : ");
        name = keyboard.next();

        System.out.print("What is the population of the species? : ");
        population = keyboard.nextInt();
        while (population < 0) {
            System.out.println("Population cannot be negative.");
            System.out.print("Reenter population: ");
            population = keyboard.nextInt();
        }

        System.out.print("Enter growth rate (% increase per year): ");
        growthRate = keyboard.nextDouble();
    }
//-----------------------------------------------------------------------------
    public void writeOutput() {

         System.out.println("Name = " + name);
         System.out.println("Population = " + population);
         System.out.println("Growth rate = " + growthRate + "%");
    }
//-----------------------------------------------------------------------------
    public int populationIn(int years) {

        double populationAmount = population;

        while ((years > 0) && (populationAmount > 0)) {
            populationAmount += (growthRate/100) * populationAmount;
            years--;
        }
        if (populationAmount > 0) {
            return((int)populationAmount);
        } else {
            return(0);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================