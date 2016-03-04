//=============================================================================
public class ArrayClone {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] originalData = {12,23,34,45};
        int[] copyData;
        int index;

        System.out.print("Original data: ");
        for (index = 0; index < originalData.length; index++) {
            System.out.print(originalData[index] + " ");
        }
        System.out.println();

        copyData = (int[])originalData.clone();

        System.out.print("Copy data    : ");
        for (index = 0; index < copyData.length; index++) {
            System.out.print(copyData[index] + " "); 
        }
        System.out.println();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================