import java.util.Scanner;
//=============================================================================
public class CurrencyConverter1OneFile {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double todaysRate;
        double dollars;
        double rands;
        CurrencyConverter1 randConverter;

        randConverter = new CurrencyConverter1();

        System.out.print("What is today's Rand exchange rate? ");
        todaysRate = keyboard.nextDouble();
        randConverter.setExchangeRate(todaysRate);

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

//=============================================================================
class CurrencyConverter1 {
//-----------------------------------------------------------------------------
    private double exchangeRate;
//-----------------------------------------------------------------------------
    public void setExchangeRate(double rate) {

        exchangeRate = rate;
    }
//-----------------------------------------------------------------------------
    public double fromDollars(double amountInDollars) {

        double foreignAmount;

        foreignAmount = amountInDollars * exchangeRate;
        return(foreignAmount);
    }
//-----------------------------------------------------------------------------
    public double toDollars(double amountInForeign) {

        double dollarAmount;

        dollarAmount = amountInForeign / exchangeRate;
        return(dollarAmount);
    }