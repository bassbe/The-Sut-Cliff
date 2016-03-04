import java.util.Scanner;
//=============================================================================
public class UseCurrencyConverter2 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double todaysRate;
        double dollars;
        double rands;
        CurrencyConverter2 randConverter;

        randConverter = new CurrencyConverter2();

//        System.out.print("What is today's Rand exchange rate? ");
//        todaysRate = keyboard.nextDouble();
//        randConverter.setExchangeRate(todaysRate);

        System.out.print("How much money do you have in $s? ");
        dollars = keyboard.nextDouble();
        rands = randConverter.fromDollars(dollars);
        System.out.printf("That's R%.2f\n",rands);

        System.out.print("How much money do you have in Rands? ");
        rands = keyboard.nextDouble();
        dollars = randConverter.toDollars(rands);
        System.out.printf("That's $%.2f\n",dollars);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================