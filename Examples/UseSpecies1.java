//=============================================================================
public class UseSpecies1 {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Species1 speciesOfTheMonth = new Species1();
        int futurePopulation;

        System.out.println("Enter data on the Species of the Month: ");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 

        futurePopulation = speciesOfTheMonth.populationIn(10);
        System.out.println("In ten years the population will be " + 
futurePopulation);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================