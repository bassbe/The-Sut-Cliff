//=============================================================================
public class CurrencyConverter1 {
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
//-----------------------------------------------------------------------------
}
//=============================================================================