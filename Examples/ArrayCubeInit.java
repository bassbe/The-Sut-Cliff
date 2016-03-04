//=============================================================================
public class ArrayCubeInit {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char[][][] wordCube = {{{'W','e'},{'a','l','l'}},
                               {{'l','o','v','e'}},
                               {{'J','a','v','a'},{'a','t'},{'U','M'}}};
        int plane,row,column;

        for (plane = 0; plane < wordCube.length; plane++) {
            for (row = 0; row < wordCube[plane].length; row++) {
                for (column = 0; column < wordCube[plane][row].length;
column++) {
                    System.out.print(wordCube[plane][row][column]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================