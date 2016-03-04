import java.util.Scanner;
//=============================================================================
public class EnumSeason {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);

    private static enum Season {SPRING,SUMMER,FALL,WINTER};
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Season theSeason;
        int seasonIndex;
        Season[] allSeasons;

        allSeasons = Season.values();
        for (seasonIndex=0;seasonIndex < allSeasons.length;seasonIndex++) {
            System.out.println("Season " + seasonIndex + " is " +
allSeasons[seasonIndex]);
        }

        System.out.print("Enter your season : ");
        theSeason = inputSeason();
        System.out.println("Your season is " + theSeason);
    }
//-----------------------------------------------------------------------------
    private static Season inputSeason() {

        String stringSeason;

        stringSeason = keyboard.next();
        if (stringSeason.equalsIgnoreCase("SPRING")) {
            return(Season.SPRING);
        } else if (stringSeason.equalsIgnoreCase("SUMMER")) {
            return(Season.SUMMER);
        } else if (stringSeason.equalsIgnoreCase("FALL")) {
            return(Season.FALL);
        } else if (stringSeason.equalsIgnoreCase("WINTER")) {
            return(Season.WINTER);
        } else {
            return(null);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
