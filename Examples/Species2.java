import java.util.Scanner;
//=============================================================================
public class Species2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    private String name;
    private int population;
    private double growthRate;
//-----------------------------------------------------------------------------
    public Species2() {

        name = "";
        population = 0;
        growthRate = 0.0;
    }
//-----------------------------------------------------------------------------
    public String getName() {

        return(name);
    }
//-----------------------------------------------------------------------------
    public int getPopulation() {

        return(population);
    }
//-----------------------------------------------------------------------------
    public double getGrowthRate() {

        return(growthRate);
    }
//-----------------------------------------------------------------------------
    public boolean setPopulation(int newPopulation) {

        if (newPopulation >= 0) {
            population = newPopulation;
            return(true);
        } else {
            System.out.println("ERROR " + newPopulation + 
" is an invalid population");
            return(false);
        }
    }
//-----------------------------------------------------------------------------
    public void setGrowthRate(double newGrowthRate) {

        growthRate = newGrowthRate;
    }
//-----------------------------------------------------------------------------
    public void readInput() {

        System.out.print("What is the species name?              : ");
        name = keyboard.next();

        System.out.print("What is the population of the species? : ");
        while (! setPopulation(keyboard.nextInt())) {
            System.out.print("Reenter population: ");
        }

        System.out.print("Enter growth rate (% increase per year): ");
        setGrowthRate(keyboard.nextDouble());
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