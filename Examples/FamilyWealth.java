import java.util.Scanner;
//=============================================================================
public class FamilyWealth {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double WEALTHY_SALARY = 130000;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double fatherSalary,motherSalary,otherSalary,familySalary;

        fatherSalary = getSalaryAndReportWealth("father");
        motherSalary = getSalaryAndReportWealth("mother");
        otherSalary = getSalaryAndReportWealth("others");

        familySalary = fatherSalary + motherSalary + otherSalary;
        reportWealth("family",familySalary);
    }
//-----------------------------------------------------------------------------
    private static double getSalaryAndReportWealth(String who) {

        double whosSalary;

        System.out.print("Enter the salary for the " + who + " : ");
        whosSalary = keyboard.nextDouble();
        reportWealth(who,whosSalary);
        return(whosSalary);
    }
//-----------------------------------------------------------------------------
    private static void reportWealth(String who,double salary) {

        boolean wealthy;

        wealthy = salary >= WEALTHY_SALARY;
        System.out.println("The " + who + " is wealthy : " + wealthy);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================