//=============================================================================
public class ArrayRAMMatrix {
//-----------------------------------------------------------------------------
    private static final int MATRIX_ROWS = 5;
    private static final int MATRIX_COLUMNS = 4;
    private static final int MAX_ENTRY = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][] matrix = new int[MATRIX_ROWS][MATRIX_COLUMNS];
        int row,column;
        int[] middleRow;

        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * MAX_ENTRY);
            }
        }

        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        middleRow = matrix[matrix.length / 2];
        for (column = 0; column < middleRow.length; column++) {
            middleRow[column] = 0;
        }

        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================