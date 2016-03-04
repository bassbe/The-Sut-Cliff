//=============================================================================
public class CarDealer {
//-----------------------------------------------------------------------------
//----These can be static and every object will know
    private static final int MAX_CARS = 10;
    private static final double MARK_UP = 0.3;

    private String name;
    private Car[] carsOnLot;
//-----------------------------------------------------------------------------
    public CarDealer() {

        int index;

        name = null;
        carsOnLot = new Car[MAX_CARS];
        for (index = 0; index < carsOnLot.length; index++) { 
            carsOnLot[index] = null;
        }
    }
//-----------------------------------------------------------------------------
    public CarDealer(String newName) {

        this();
        name = newName;
    }
//-----------------------------------------------------------------------------
    public void display() {

        int index;

        System.out.println(name);
        for (index = 0; index < carsOnLot.length; index++) {
            if (carsOnLot[index] != null) {
                System.out.print("   "+ (index+1) + ": ");
                System.out.println(carsOnLot[index]);
            }
        }
    }
//-----------------------------------------------------------------------------
    public void buyCar(String makeAndModel,double price) {

        int index;
        
        index = 0; 
        while (index < carsOnLot.length && carsOnLot[index] != null) {
            index++;
        }
        if (index < carsOnLot.length) {
            carsOnLot[index] = new Car(makeAndModel,price,
price * (1.0 + MARK_UP));
        } else {
            System.out.println("ERROR: No more space on the lot");
        }
    }
//-----------------------------------------------------------------------------
    public double sellCar(int carIndex,double actualSalePrice) {

        double profit;

        carIndex--;
        if (carsOnLot[carIndex] == null) {
            System.out.println("ERROR: No car there");
            return(0.0);
        } else {
            profit = actualSalePrice - carsOnLot[carIndex].getPurchasePrice();
            carsOnLot[carIndex] = null;
            return(profit);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
