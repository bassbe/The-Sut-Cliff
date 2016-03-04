//=============================================================================
public class ArrayDup {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] originalData = {12,23,34,45};
        int[] sameData;
        int[] copyData;
        int index;

        System.out.print("Original data: ");
        for (index = 0; index < originalData.length; index++) {
            System.out.print(originalData[index] + " ");
        }
        System.out.println();

        sameData = originalData;
        System.out.print("Same data    : ");
        for (index = 0; index < sameData.length; index++) {
            System.out.print(sameData[index] + " ");
        }
        System.out.println();

        copyData = new int[originalData.length];
        for (index = 0; index < originalData.length; index++) {
            copyData[index] = originalData[index];
            originalData[index] = 99;
        }

        System.out.print("Copy data    : ");
        for (index = 0; index < copyData.length; index++) {
            System.out.print(copyData[index] + " "); 
        }
        System.out.println();

        System.out.print("Original data: ");
        for (index = 0; index < originalData.length; index++) {
            System.out.print(originalData[index] + " ");
        }
        System.out.println();

        System.out.print("Same data    : ");
        for (index = 0; index < sameData.length; index++) {
            System.out.print(sameData[index] + " ");
        }
        System.out.println();

//----Gosh, does this need some factoring?
    }
//-----------------------------------------------------------------------------
}
//=============================================================================