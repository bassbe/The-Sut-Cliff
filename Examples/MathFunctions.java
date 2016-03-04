import java.util.Scanner;
//=============================================================================
public class MathFunctions {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double MAX_RADIUS = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double a,b,c;
        double offset;
        double root1,root2;
        double radius;
        double area;

        System.out.print("For ax^2 + bx + c, enter a b c : ");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        System.out.println("The polynomial is " + a + "x^2 + " + b + "x + " +
c);
        
        offset = Math.sqrt(Math.pow(b,2) - 4*a*c);
        root1 = (-b + offset) / (2*a);
        root2 = (-b - offset) / (2*a);
        System.out.println("The roots are " + root1 + " and " + root2);

        radius = Math.random() * MAX_RADIUS;
        System.out.println("The random radius is " + radius);
        area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of that circle is " + area);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================