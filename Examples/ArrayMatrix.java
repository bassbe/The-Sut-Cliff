//=============================================================================
public class ArrayMatrix {
//-----------------------------------------------------------------------------
    private static final int MATRIX_ROWS = 5;
    private static final int MATRIX_COLUMNS = 4;
    private static final int MAX_VALUE = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][] matrix = new int[MATRIX_ROWS][MATRIX_COLUMNS];
        int row,column;

        for (row = 0; row < MATRIX_ROWS; row++) {
            for (column = 0; column < MATRIX_COLUMNS; column++) {
                if (row == column) {
                    matrix[row][column] = 0;
                } else {
                    matrix[row][column] = (int)(Math.random() * MAX_VALUE);
                }
            }
        }

        for (row = 0; row < MATRIX_ROWS; row++) {
            for (column = 0; column < MATRIX_COLUMNS; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================