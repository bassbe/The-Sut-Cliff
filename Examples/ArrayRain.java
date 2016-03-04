import java.util.Scanner;
//=============================================================================
public class ArrayRain {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double[] rainfall;
        int numberOfMonths;
        double average;
        double sum;
        int index;

        System.out.print("How many months of data : ");
        numberOfMonths = keyboard.nextInt();
        rainfall = new double[numberOfMonths];

        for (index = 0; index < rainfall.length; index++) {
            System.out.print("Enter rainfall for month " + (index+1) + " : ");
            rainfall[index] = keyboard.nextDouble();
        }

        sum = 0.0;
        System.out.print("The rainfalls are : ");
        for (index = 0; index < rainfall.length; index++) {
            System.out.print(rainfall[index] + " ");
            sum += rainfall[index];
        }
        System.out.println();

        average = sum / rainfall.length;
        System.out.println("The sum is " + sum + " and the average is " +
average);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================