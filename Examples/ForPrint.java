//=============================================================================
public class ForPrint {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int index;
        int accelerator;

        for (index = 0; index < 8; index++) {
            System.out.println("Going up   " + index);
        }
        System.out.println();

        for (index = 7; index >= 0; index--) {
            System.out.println("Going down " + index);
        }
        System.out.println();

        for (index = 0; index < 16; index += 2) {
            System.out.println("Going up fast     " + index);
        }
        System.out.println();

        accelerator = 0;
        for (index = 15; index >= 0; index -= accelerator) {
            System.out.println("Going down faster " + index);
            accelerator++;
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================