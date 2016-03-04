import java.util.Scanner;
//=============================================================================
public class PizzaBoxInMain {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double PI = 3.14159265;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double diameter;
        double boxArea;
        double pizzaArea;
        double radius;


        System.out.print("What is the diameter? ");
        diameter = keyboard.nextDouble();
        boxArea = diameter * diameter;
        radius = diameter/2;
        pizzaArea = PI * radius * radius;

        System.out.println("The box area is   " + boxArea);
        System.out.println("The pizza area is " + pizzaArea);
        System.out.println("The difference is " + (boxArea - pizzaArea));

    }
//-----------------------------------------------------------------------------
}
//=============================================================================