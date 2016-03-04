import java.util.Scanner;
//=============================================================================
public class ArrayLinearSearch {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 50;
    private static final int MAX_VALUE = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] randomData = new int[DATA_SIZE];
        int index,searchFor;
        int foundAt;

        for (index = 0; index < randomData.length; index++) {
            randomData[index] = (int)(Math.random() * MAX_VALUE);
        }

        System.out.print("What value would you like to search for? : ");
        searchFor = keyboard.nextInt();

        index = 0;
        while (index < randomData.length && randomData[index] != searchFor) {
            index++;
        }

        if (index < randomData.length) {
            System.out.println(searchFor + " found at position " + index + 
" in the " + DATA_SIZE + " elements");
             foundAt = index;
        } else {
            System.out.println(searchFor + " not found after examining " +
index + " elements");
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