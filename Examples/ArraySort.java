import java.util.Scanner;
import java.util.Arrays;
//=============================================================================
public class ArraySort {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 50;
    private static final int MAX_VALUE = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] randomData = new int[DATA_SIZE];
        int index,searchFor;

        for (index = 0; index < randomData.length; index++) {
            randomData[index] = (int)(Math.random() * MAX_VALUE);
        }
        System.out.print("The random data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            System.out.print(randomData[index] + " ");
        }
        System.out.println();

        sortTheArray(randomData);

        System.out.print("The sorted data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            System.out.print(randomData[index] + " ");
        }
        System.out.println();

    }
//-----------------------------------------------------------------------------
    private static void sortTheArray(int[] dataToSort) {

        int positionToFill;
        int positionToTest;
        int smallestPosition;
        int smallestValue;
        int temporary;

        for (positionToFill = 0;positionToFill < dataToSort.length;
positionToFill++) {
//----Assume the position to fill is the smallest, then test the rest
            smallestPosition = positionToFill;
            smallestValue = dataToSort[positionToFill];
            for (positionToTest = positionToFill+1; 
positionToTest < dataToSort.length;positionToTest++) {
                if (dataToSort[positionToTest] < smallestValue) {
                    smallestPosition = positionToTest;
                    smallestValue = dataToSort[positionToTest];
                }
            }
//----Swap the smallest value into this position
            temporary = dataToSort[positionToFill];
            dataToSort[positionToFill] = dataToSort[smallestPosition];
            dataToSort[smallestPosition] = temporary;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================