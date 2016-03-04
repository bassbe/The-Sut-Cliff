import java.util.Scanner;
//=============================================================================
public class WhileBoolean {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final long MINIMAL_PRIME = 5245;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        boolean tryAgain = true;
        long primeGuess;

        while (tryAgain) {
            System.out.print("Enter a large prime number : ");
            primeGuess = keyboard.nextLong();
            if (primeGuess <= MINIMAL_PRIME) {
                System.out.println("Not large enough, you woos");
            } else if (isPrime(primeGuess)) {
                tryAgain = false;
            } else {
                System.out.println("Not prime, you dolt");
            }
        }

    }
//-----------------------------------------------------------------------------
    private static boolean isPrime(long candidate) {

        long divisor = 2;

        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                System.out.println(candidate + " is divisible by " + divisor);
                return(false);
            }
            divisor++;
        }

        return(true);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================