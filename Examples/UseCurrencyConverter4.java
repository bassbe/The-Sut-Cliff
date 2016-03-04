import java.util.Scanner;
//=============================================================================
public class UseCurrencyConverter4 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double yesterdaysRate;
        double dollars;
        double rands;
        CurrencyConverter4 randConverter;

        randConverter = new CurrencyConverter4();

        System.out.print("How much money do you have in $s? ");
        dollars = keyboard.nextDouble();
        rands = randConverter.fromDollars(dollars);
        System.out.printf("That's R%.2f\n",rands);

        System.out.print("How much money do you have in Rands? ");
        rands = keyboard.nextDouble();
        dollars = randConverter.toDollars(rands);
        System.out.printf("That's $%.2f\n",dollars);

        System.out.print("What was yesterday's Rand exchange rate? ");
        yesterdaysRate = keyboard.nextDouble();
        randConverter.setExchangeRate(yesterdaysRate);
        dollars = randConverter.toDollars(rands);
        System.out.printf("That was $%.2f\n",dollars);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================