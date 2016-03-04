import java.util.Scanner;
//=============================================================================
public class IfElseIf {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int age;
        char sex;
        double income;

        System.out.print("Enter age, sex (M/F), income : ");
        age = keyboard.nextInt();
        sex = Character.toUpperCase(keyboard.next().charAt(0));
        income = keyboard.nextDouble();

        System.out.println("You are a " + age + " year old " +
(sex == 'M' ? "male" : "female") + " who earns $" + income);

        if (age < 14) {
            System.out.println("No nightclubs for you");
        } else if (age > 14 && age < 21 && sex == 'F') {
            System.out.println("You can sneak into Spin");
        } else if ((age > 16 && age <= 45) || income > 10000) {
            System.out.println("Try Space tonight");
        } else if (age > 45 && age < 60) {
            System.out.println("Pretend you're young at Hillstone");
        } else {
            System.out.println("Hope you enjoy watching TV");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================