import java.io.*;
//=============================================================================
public class FileCarDealer {
//-----------------------------------------------------------------------------
//----These can be static and every object will know
    private static final int MAX_CARS = 10;
    private static final double MARK_UP = 0.3;

    private String name;
    private FileCar[] carsOnLot;
//-----------------------------------------------------------------------------
    public FileCarDealer() {

        int index;

        name = null;
        carsOnLot = new FileCar[MAX_CARS];
        for (index = 0; index < carsOnLot.length; index++) { 
            carsOnLot[index] = null;
        }
    }
//-----------------------------------------------------------------------------
    public FileCarDealer(String newName) {

        this();
        name = newName;
    }
//-----------------------------------------------------------------------------
    public boolean saveCarFile(String fileName) {

        ObjectOutputStream toStream;
        int carNumber;

        try {
            toStream = new ObjectOutputStream(new FileOutputStream(fileName));

            for (carNumber = 0; carNumber < carsOnLot.length; carNumber++) {
                if (carsOnLot[carNumber] != null) {
                    toStream.writeObject(carsOnLot[carNumber]);
                }
            }
            toStream.close();
            return(true);
        } catch (IOException e) {
            System.out.println("ERROR: Saving cars: " + e.getMessage());
            return(false);
        }
    }
//-----------------------------------------------------------------------------
    public boolean loadCarFile(String fileName) {

        ObjectInputStream fromStream;
        FileCar nextCar;
        int numberOfCars;

        numberOfCars = 0;
        fromStream = null;
        try {
            fromStream = new ObjectInputStream(new FileInputStream(fileName));
            nextCar = (FileCar)fromStream.readObject();
            while (nextCar != null) {
                carsOnLot[numberOfCars] = nextCar;
                numberOfCars++;
                nextCar = (FileCar)fromStream.readObject();
            }
        } catch (EOFException e) {
            // System.out.println("ERROR: Loading cars: " + e.getMessage());
            // return(false);
        } catch (IOException e) {
            System.out.println("ERROR: Loading cars: " + e.getMessage());
            return(false);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return(false);
        } finally {
            System.out.println(numberOfCars + " cars read from " + fileName);
            try {
                fromStream.close();
            } catch (IOException e) {
                System.out.println("ERROR: Closing file: " + e.getMessage());
                return(false);
            }
        }
        return(true);
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
        while (carsOnLot[index] != null) {
            index++;
        }
        if (index < carsOnLot.length) {
            carsOnLot[index] = new FileCar(makeAndModel,price,
price * (1.0 + MARK_UP));
        } else {
            System.out.println("ERROR: No more space on the lot");
        }
    }
//-----------------------------------------------------------------------------
    public double sellCar(int carIndex,double actualSalePrice) {

        FileCar soldCar;

        carIndex--;
        if (carsOnLot[carIndex] == null) {
            System.out.println("ERROR: No car there");
            return(0.0);
        } else {
            soldCar = carsOnLot[carIndex];
            carsOnLot[carIndex] = null;
            return(actualSalePrice - soldCar.getPurchasePrice());
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
