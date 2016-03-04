import java.util.Scanner;
//=============================================================================
public class ArrayIrreg1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int STORES = 3;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double[][] storeData = new double[STORES][];
        int store,size,item;

        for (store = 0; store < storeData.length; store++) {
            System.out.print("How many items in store " + store + " : ");
            size = keyboard.nextInt();
            storeData[store] = new double[size];
//----Add data for items in store
            for (item = 0; item < storeData[store].length; item++) {
                System.out.print("Enter data for store " + store +
", item number " + item + " : ");
                storeData[store][item] = keyboard.nextDouble();
            }

        }

        System.out.print("Which store shall I recall : ");
        store = keyboard.nextInt();
        while (store >= 0 && store < storeData.length) {
            for (item = 0; item < storeData[store].length; item++) {
                System.out.print(storeData[store][item] + " ");
            }
            System.out.println();
            System.out.print("Which store shall I recall : ");
            store = keyboard.nextInt();
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================