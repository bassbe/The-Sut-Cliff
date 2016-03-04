//=============================================================================
public class ConvertCommandLineInts {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int index;
        int intValue;
        int total;

        total = 0;
        for (index = 0; index < args.length; index++) {
            intValue = Integer.parseInt(args[index]);
            System.out.println(index + " : " + intValue);
            total += intValue;
        }
        System.out.println("The total is " + total);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
