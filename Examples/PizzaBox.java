import java.util.Scanner;
//=============================================================================
public class PizzaBox {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double diameter;
        double boxArea;
        double pizzaArea;

        System.out.print("What is the diameter? ");
        diameter = keyboard.nextDouble();

        boxArea = computeBoxArea(diameter);
        pizzaArea = computePizzaArea(diameter);

        printPizzaSpace(boxArea,pizzaArea);
    }
//-----------------------------------------------------------------------------
    private static double computeBoxArea(double side) {

        double squareBoxArea;

        squareBoxArea = side * side;
        return(squareBoxArea);
    }
//-----------------------------------------------------------------------------
    private static double computePizzaArea(double diameter) {

        double radius;

        radius = diameter/2;
        return(Math.PI * radius * radius);
    }
//-----------------------------------------------------------------------------
    private static void printPizzaSpace(double boxArea,double pizzaArea) {

        System.out.println("The box area is   " + boxArea);
        System.out.println("The pizza area is " + pizzaArea);
        System.out.println("The difference is " + (boxArea - pizzaArea));
    }
//-----------------------------------------------------------------------------
}
//=============================================================================