import java.util.Scanner;
//=============================================================================
public class Assert {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int MAX_MARKS = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        boolean finished;
        int numberOfMarks;
        int[][] marks = new int[2][MAX_MARKS];
        float percentage;

        System.out.println("Enter mark and maximal mark pairs, 0 0 to end.");
        numberOfMarks = 0;
        finished = false;
        do {
            marks[0][numberOfMarks] = keyboard.nextInt();
            marks[1][numberOfMarks] = keyboard.nextInt();
            if (marks[0][numberOfMarks] == 0 && marks[1][numberOfMarks] == 0) {
                finished= true;
            } else if (marks[0][numberOfMarks] >= 0 &&
marks[0][numberOfMarks] <= marks[1][numberOfMarks]) {
                numberOfMarks++;
            } else {
                System.out.println("Invalid pair");
            }
        } while (!finished && numberOfMarks < MAX_MARKS);

//----computePercentage was subcontracted
        percentage = computePercentage(marks,numberOfMarks);
        assert (percentage >= 0.0 && percentage <= 100.0) : percentage;

        System.out.printf("The overall percentage is %5.1f%%\n",percentage);

    }
//-----------------------------------------------------------------------------
    private static float computePercentage(int[][] marks,int numberOfMarks) {

        byte total;
        byte maximal;
        int index;

        total = 0;
        maximal = 0;
        for (index = 0; index < numberOfMarks; index++) {
            total += marks[0][index];
            maximal += marks[1][index];
        }

        return((100.0f * total)/maximal);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================