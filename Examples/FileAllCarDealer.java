import java.io.*;
//=============================================================================
public class FileAllCarDealer implements Serializable {
//-----------------------------------------------------------------------------
//----These can be static and every object will know
    private static final int MAX_CARS = 10;
    private static final double MARK_UP = 0.3;

    private String name;
    private int numberOfCars;
    private FileCar[] carsOnLot;
//-----------------------------------------------------------------------------
    public FileAllCarDealer() {

        int index;

        name = null;
        numberOfCars = 0;
        carsOnLot = new FileCar[MAX_CARS];
        for (index = 0; index < carsOnLot.length; index++) { 
            carsOnLot[index] = null;
        }
    }
//-----------------------------------------------------------------------------
    public FileAllCarDealer(String newName) {

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
            carsOnLot[index] = new FileCar(makeAndModel,price,
price * (1.0 + MARK_UP));
            numberOfCars++;
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
            numberOfCars--;
            return(profit);
        }
    }
//-----------------------------------------------------------------------------
    public static void saveCarDealer(String fileName,FileAllCarDealer dealer) throws IOException {

        ObjectOutputStream toStream;

        toStream = new ObjectOutputStream(new FileOutputStream(fileName));
        toStream.writeObject(dealer);
        toStream.close();
    }
//-----------------------------------------------------------------------------
    public static FileAllCarDealer loadCarDealer(String fileName) 
throws IOException {

        ObjectInputStream fromStream = null;
        FileAllCarDealer local;

        fromStream = new ObjectInputStream(new FileInputStream(fileName));
        try {
            local = (FileAllCarDealer)fromStream.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return(null);
        } finally {
            try {
                if (fromStream != null) {
                    fromStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return(null);
            }
        }
        return(local);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
