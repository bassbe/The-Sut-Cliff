import java.util.Scanner;
//=============================================================================
public class UseCurrencyConverter3 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double todaysRate,yesterdaysRate;
        double dollars;
        double rands;
        CurrencyConverter3 randConverter;

        System.out.print("What is today's Rand exchange rate? ");
        todaysRate = keyboard.nextDouble();
        randConverter = new CurrencyConverter3(todaysRate);

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

        randConverter = new CurrencyConverter3();
        dollars = randConverter.toDollars(rands);
        System.out.printf("At one-to-one that is $%.2f\n",dollars);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================