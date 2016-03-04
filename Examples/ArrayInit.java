import java.util.Scanner;
//=============================================================================
public class ArrayInit {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double[] gradeCutOffs = {85,75,65,50,0};
        char[] grades = {'A','B','C','D','N'};
        double percentage;
        int index;

        if (gradeCutOffs.length != grades.length) {
            System.out.println("ERROR: Different # of grades and cutoffs");
            return;
        }

        System.out.print("What is the percentage : ");
        percentage = keyboard.nextDouble();

        index = 0;
        while (percentage < gradeCutOffs[index]) {
            index++;
        }

        System.out.println("The grade is " + grades[index]);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================