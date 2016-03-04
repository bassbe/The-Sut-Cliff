import java.util.Scanner;
//=============================================================================
public class ArrayElements1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int PRIMES_STORE_SIZE = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        long primes[] = new long[PRIMES_STORE_SIZE];
        int primeNumber;

        primes[0] = 1;
        primes[1] = 2;
        primes[2] = 3;
        primes[3] = 5;
        primes[4] = 7;
        primes[5] = 11;
        primes[6] = 13;
        primes[7] = 17;
        primes[8] = 19;
        primes[9] = 23;

        do {
            System.out.print("Which prime do you want? : ");
            primeNumber = keyboard.nextInt();
        } while (primeNumber < 0 || primeNumber >= PRIMES_STORE_SIZE);

        System.out.println("Prime number " + primeNumber + " is " +
primes[primeNumber]);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================