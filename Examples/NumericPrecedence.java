//=============================================================================
public class NumericPrecedence {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double foodCost;
        double drinksCost;
        int tipPercent;
        double amountToPay;

        foodCost = 20;
        drinksCost = 10;
        tipPercent = 10;

        amountToPay = (foodCost + drinksCost) * (100+tipPercent)/100.0;
        System.out.println("Really pay $" + amountToPay);

        amountToPay = foodCost + drinksCost * 100+tipPercent/100.0;
        System.out.println("Pay $" + amountToPay);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================