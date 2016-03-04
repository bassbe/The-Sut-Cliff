//=============================================================================
public class ForPower {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("2.5^3 is " + (power(2.5,3)));
        System.out.println("2.0^10 is " + (power(2.0,10)));

    }
//-----------------------------------------------------------------------------
    private static double power(double base,int exponent) {

        int index;
        double result = 1.0;

        for (index = 0; index < exponent; index++) {
            result *= base;
        }

        return(result);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================