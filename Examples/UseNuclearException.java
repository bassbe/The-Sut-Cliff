import java.util.Scanner;
//=============================================================================
public class UseNuclearException {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double CRITCAL_MASS = 13; 
//---Kg, for reactor-grade plutonium
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double mass;

        System.out.print("How much plutonium do you have : ");
        mass = keyboard.nextDouble();
        try {
            shootPlutonium(mass);
            System.out.println("Whew, that was scary, but we lived");
        } catch (NuclearException e) {
            System.out.println(e.getMessage());
        }

    }
//-----------------------------------------------------------------------------
    private static void shootPlutonium(double mass) 
throws NuclearException {

        if (mass >= CRITCAL_MASS) {
            throw(new NuclearException(mass));
        }

        System.out.println("Shot fired");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
