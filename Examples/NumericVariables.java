import java.util.Scanner;
//=============================================================================
public class NumericVariables {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double PI = 3.14159265;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int year = 2002;
        int favouriteInteger;
        byte smallNumber;
        double georgeApprovalRating;

        System.out.println("Pi is " + PI);

        georgeApprovalRating = 0.63;
        System.out.println("In " + year + 
" George Bush had an approval rating of " + georgeApprovalRating);
        year = 2003;
        georgeApprovalRating = 0.54;
        System.out.println("In " + year + 
" George Bush had an approval rating of " + georgeApprovalRating);
        
        favouriteInteger = 27;
        favouriteInteger = 16;
        favouriteInteger = 28;
        System.out.println("My favourite integer is " + favouriteInteger);

        System.out.print("Enter a small number: ");
        smallNumber = keyboard.nextByte();
        System.out.println("My small number is " + smallNumber);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================