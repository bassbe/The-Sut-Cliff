import java.util.Scanner;
//=============================================================================
public class FamilyWealthInMain {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double WEALTHY_SALARY = 130000;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double fatherSalary;
        double motherSalary;
        double otherSalary;
        double familySalary;
        boolean wealthy;

        System.out.print("Enter the salary for the father : ");
        fatherSalary = keyboard.nextDouble();
        wealthy = fatherSalary >= WEALTHY_SALARY;
        System.out.println("The father is wealthy : " + wealthy);

        System.out.print("Enter the salary for the mother : ");
        motherSalary = keyboard.nextDouble();
        wealthy = motherSalary >= WEALTHY_SALARY;
        System.out.println("The mother is wealthy : " + wealthy);

        System.out.print("Enter the salary for the others : ");
        otherSalary = keyboard.nextDouble();
        wealthy = otherSalary >= WEALTHY_SALARY;
        System.out.println("The others are wealthy : " + wealthy);

        familySalary = fatherSalary+motherSalary+otherSalary;
        wealthy = familySalary >= WEALTHY_SALARY;
        System.out.println("The family is wealthy : " + wealthy);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================