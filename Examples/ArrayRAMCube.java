//=============================================================================
public class ArrayRAMCube {
//-----------------------------------------------------------------------------
    private static final int CUBE_PLANES = 3;
    private static final int CUBE_ROWS = 5;
    private static final int CUBE_COLUMNS = 4;
    private static final int MAX_ENTRY = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][][] cube = new int[CUBE_PLANES][CUBE_ROWS][CUBE_COLUMNS];
        int plane,row,column;
        int[][] middlePlane;
        int[] middleRow;

        for (plane = 0; plane < cube.length; plane++) {
            for (row = 0; row < cube[plane].length; row++) {
                for (column = 0; column < cube[plane][row].length; column++) {
                    cube[plane][row][column] = (int)(Math.random() * 
MAX_ENTRY);
                }
            }
        }

        for (plane = 0; plane < cube.length; plane++) {
            for (row = 0; row < cube[plane].length; row++) {
                for (column = 0; column < cube[plane][row].length; column++) {
                    System.out.print(cube[plane][row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        middlePlane = cube[cube.length/2];
        middleRow = middlePlane[middlePlane.length/2];
        for (column = 0; column < middleRow.length; column++) {
            middleRow[column] = 0;
        }

        for (plane = 0; plane < cube.length; plane++) {
            for (row = 0; row < cube[plane].length; row++) {
                for (column = 0; column < cube[plane][row].length; column++) {
                    System.out.print(cube[plane][row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================