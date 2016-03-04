import java.util.Scanner;
//=============================================================================
public class ArrayCalendar {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][] calendar = new int[6][7];
        int row,column;
        int daysInMonth,startColumn,dayNumber;

        for (row = 0; row < 6; row++) {
            for (column = 0; column < 7; column++) {
                calendar[row][column] = -1;
            }
        }

        System.out.print("How many days in the month        : ");
        daysInMonth = keyboard.nextInt();
        System.out.print("Which column does the month start : ");
        startColumn = keyboard.nextInt();

        for (dayNumber = 1; dayNumber <= daysInMonth; dayNumber++) {
            row = (dayNumber-1 + startColumn) / 7;
            column = (dayNumber-1 + startColumn) % 7;
            calendar[row][column] = dayNumber;
        }

        for (row = 0; row < 6; row++) {
            for (column = 0; column < 7; column++) {
                if (calendar[row][column] == -1) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d ",calendar[row][column]);
                }
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================