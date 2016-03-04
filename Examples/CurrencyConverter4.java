import java.util.Scanner;
//=============================================================================
public class CurrencyConverter4 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    private double exchangeRate;
//-----------------------------------------------------------------------------
    public CurrencyConverter4() {

        System.out.print("What is today's exchange rate? ");
        exchangeRate = keyboard.nextDouble();
    }
//-----------------------------------------------------------------------------
    public CurrencyConverter4(double rate) {

        exchangeRate = rate;
    }
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
//-----------------------------------------------------------------------------
}
//=============================================================================