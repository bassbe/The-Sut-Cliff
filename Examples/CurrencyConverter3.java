//=============================================================================
public class CurrencyConverter3 {
//-----------------------------------------------------------------------------
    private double exchangeRate;
//-----------------------------------------------------------------------------
    public CurrencyConverter3() {

        exchangeRate = 1.0;
    }
//-----------------------------------------------------------------------------
    public CurrencyConverter3(double rate) {

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