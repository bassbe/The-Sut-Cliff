import java.util.Scanner;
//=============================================================================
public class PrintGrade {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double A_GRADE = 85.0;
    private static final double B_GRADE = 75.0;
    private static final double C_GRADE = 65.0;
    private static final double D_GRADE = 50.0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double percentage;
        char grade;

        System.out.print("What is the percentage? ");
        percentage = keyboard.nextDouble();
        if (percentage < 0.0 || percentage > 100.0) {
            System.out.println("ERROR: Illegal value");
        } else {
            grade = computeGrade(percentage);
            System.out.println("Your grade is " + grade);
            switch (grade) {
                case 'A':
                    System.out.println("Everybody is impressed!");
                    break;
                case 'B':
                    System.out.println("You're rock solid!");
                    break;
                case 'C':
                    System.out.println("I hope you didn't study too hard!");
                    break;
                case 'D':
                    System.out.println("Consider a career in politics!");
                    break;
                case 'N':
                    System.out.println("I'll tell the next joke very slowly!");
                    break;
                default:
                    System.out.println("ERROR: Illegal grade");
                    break;
            }
        }
    }
//-----------------------------------------------------------------------------
    private static char computeGrade(double percentage) {

        if (percentage >= A_GRADE) {
            return('A');
        } else if (percentage >= B_GRADE) {
            return('B');
        } else if (percentage >= C_GRADE) {
            return('C');
        } else if (percentage >= D_GRADE) {
            return('D');
        } else {
            return('N');
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================