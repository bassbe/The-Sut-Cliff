import java.util.Scanner;
//=============================================================================
public class ArrayCube {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][][] binaryCube;
        int numberOfPlanes,numberOfRows,numberOfColumns;
        int plane,row,column;

        System.out.print("How many planes, rows, columns : ");
        numberOfPlanes = keyboard.nextInt();
        numberOfRows = keyboard.nextInt();
        numberOfColumns = keyboard.nextInt();

        binaryCube = new int[numberOfPlanes][numberOfRows][numberOfColumns];

        for (plane = 0; plane < numberOfPlanes; plane++) {
            for (row = 0; row < numberOfRows; row++) {
                for (column = 0; column < numberOfColumns; column++) {
                    binaryCube[plane][row][column] = 
(int) Math.round(Math.random());
                }
            }
        }

        for (plane = 0; plane < numberOfPlanes; plane++) {
            for (row = 0; row < numberOfRows; row++) {
                for (column = 0; column < numberOfColumns; column++) {
                    System.out.print(binaryCube[plane][row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================