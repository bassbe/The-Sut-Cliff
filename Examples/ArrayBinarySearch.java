import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
//=============================================================================
public class ArrayBinarySearch {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 50;
    private static final int MAX_VALUE = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] randomData = new int[DATA_SIZE];
        int index,searchFor;
        int first,last,middle;
        int count;
        int foundAt;

        for (index = 0; index < randomData.length; index++) {
            randomData[index] = (int)(Math.random() * MAX_VALUE);
        }
        Arrays.sort(randomData);

        System.out.print("What value would you like to search for? : ");
        searchFor = keyboard.nextInt();

        first = 0;
        last = randomData.length-1;
        middle = (first + last) / 2;
        count = 1;
        while (first <= last && randomData[middle] != searchFor) {
            count++;
            if (searchFor < randomData[middle]) {
                last = middle - 1;
            } else if (searchFor > randomData[middle]) {
                first = middle + 1;
            }
            middle = (first + last) / 2;
        }                   

        if (randomData[middle] == searchFor) {
            System.out.println(searchFor + " found at position " + middle + 
" in the " + DATA_SIZE + " elements after examining " + count + " elements");
             foundAt = middle;
        } else {
            System.out.println(searchFor + " not found after examining " +
count + " elements");
             foundAt = -1;
        }

        System.out.print("The random data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            if (index == foundAt) {
                System.out.print("<<" + randomData[index] + ">> ");
            } else {
                System.out.print(randomData[index] + " ");
            }
        }
        System.out.println();
    }
//-----------------------------------------------------------------------------
}
//=============================================================================