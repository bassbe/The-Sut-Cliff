import java.util.Scanner;
//=============================================================================
public class Boolean {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        boolean youCantHandleTheTruth;
        boolean anInconvenientTruth;

        youCantHandleTheTruth = true;
        System.out.print("Is the truth inconvenient? ");
        anInconvenientTruth = keyboard.nextBoolean();

        System.out.println("An inconvenient truth is " + anInconvenientTruth + 
" and you can't handle it is " + youCantHandleTheTruth);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================