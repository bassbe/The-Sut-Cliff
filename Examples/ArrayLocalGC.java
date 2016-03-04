import java.util.Scanner;
//=============================================================================
public class ArrayLocalGC {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int MONTHS_OF_SALES = 5;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double[] salesAverages;

        salesAverages = computeSalesAverages();
        outputAverages(salesAverages);

    }
//-----------------------------------------------------------------------------
    private static double[] computeSalesAverages() {

        double[] salesAmounts = new double[MONTHS_OF_SALES];
        double[] salesAverages = new double[MONTHS_OF_SALES];
        int index,averageIndex;
        double totalSales;

        for (index = 0; index < salesAmounts.length; index++) {
            System.out.print("Enter sales for month " + (index+1) + " : ");
            salesAmounts[index] = keyboard.nextDouble();
        }

        for (index = 0; index < salesAverages.length; index++) {
            totalSales = 0.0;
            for (averageIndex = 0; averageIndex <= index; averageIndex++) {
                totalSales += salesAmounts[averageIndex];
            }
            salesAverages[index] = totalSales / (index+1);
        }

        return(salesAverages);
    }
//-----------------------------------------------------------------------------
    private static void outputAverages(double[] salesAverages) {

        int index;

        for (index = 0; index < salesAverages.length; index++) {
            System.out.println("Sales average for the first " + (index+1) + 
" months is " + salesAverages[index]);
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================