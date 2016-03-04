//=============================================================================
public class UsePairOfInts {
//-----------------------------------------------------------------------------
    private static final int MAX_RANDOM = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        PairOfInts tuple;
        
        tuple = makeRandomPair();

        System.out.println(tuple.first + " and " + tuple.second);

    }
//-----------------------------------------------------------------------------
    private static PairOfInts makeRandomPair() {

        PairOfInts local = new PairOfInts();

        local.first = (int)(Math.random() * MAX_RANDOM);
        local.second = (int)(Math.random() * MAX_RANDOM);

        return(local);
   }
//-----------------------------------------------------------------------------
}
//=============================================================================
