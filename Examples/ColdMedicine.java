//=============================================================================
public class ColdMedicine {
//-----------------------------------------------------------------------------
    private String name;
    private double amount;
//-----------------------------------------------------------------------------
    public ColdMedicine(String newName) {

        name = newName;
        amount = 0.0;
    }
//-----------------------------------------------------------------------------
    public ColdMedicine(String newName,double newAmount) {

        name = newName;
        amount = newAmount;
    }
//-----------------------------------------------------------------------------
    public void displayName() {

        System.out.println("The name of this medicine is " + name);
    }
//-----------------------------------------------------------------------------
    public void displayAmount() {

        System.out.printf("You have %.2f units\n",amount);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
