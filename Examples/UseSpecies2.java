import java.util.Scanner;
//=============================================================================
public class UseSpecies2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Species2 speciesOfTheMonth = new Species2();
        int futurePopulation;

        System.out.println("Enter data on the Species of the Month: ");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 

        futurePopulation = speciesOfTheMonth.populationIn(10);
        System.out.println("In ten years the population of " +
speciesOfTheMonth.getName() + " will be " + futurePopulation);

        do {
            System.out.print("Predicted population in ten years: ");
            futurePopulation = keyboard.nextInt();
        } while (! speciesOfTheMonth.setPopulation(futurePopulation));
        System.out.print("Predicted growth rate after that? : ");
        speciesOfTheMonth.setGrowthRate(keyboard.nextDouble());

        futurePopulation = speciesOfTheMonth.populationIn(5);
        System.out.println("After another five years the population will be " +
futurePopulation);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================