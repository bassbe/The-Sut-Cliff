import java.util.Scanner;
//=============================================================================
public class Species3 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    private String name;
    private int population;
    private double growthRate;
//-----------------------------------------------------------------------------
    public Species3() {

        setName("");
        setPopulation(0);
        setGrowthRate(0.0);
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
        setName(keyboard.next());

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

        double finalPopulation;

        finalPopulation = computeFuturePopulation(years,population);

        if (finalPopulation > 0) {
            return((int)finalPopulation);
        } else {
            return(0);
        }
    }
//-----------------------------------------------------------------------------
//----This could be a very complicated population predication model
    private double computeFuturePopulation(int years,double growingPopulation) {

        while ((years > 0) && (growingPopulation > 0)) {
            growingPopulation += (growthRate/100) * growingPopulation;
            years--;
        }

        return(growingPopulation);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================