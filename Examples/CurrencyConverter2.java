//=============================================================================
public class CurrencyConverter2 {
//-----------------------------------------------------------------------------
    private double exchangeRate;
//-----------------------------------------------------------------------------
    public CurrencyConverter2() {

        exchangeRate = 1.0;
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