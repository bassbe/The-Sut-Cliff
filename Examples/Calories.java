import java.util.Scanner;
//=============================================================================
public class Calories {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int caloriesYouDoEat,caloriesYouShouldEat,excessCalories;

        caloriesYouDoEat = inputCalories();
        caloriesYouShouldEat = computeCalories();
        excessCalories = caloriesYouDoEat - caloriesYouShouldEat;

        System.out.println("You eat " + caloriesYouDoEat +
" calories, and you should eat " + caloriesYouShouldEat + " calories");
        System.out.println("You eat an excess of " + excessCalories +
" calories");

    }
//-----------------------------------------------------------------------------
    private static int inputCalories() {

        int regularCaloriesYouDoEat,munchieCalories;

        regularCaloriesYouDoEat = regularMeals();
        System.out.print("How many munchie calories do you eat   : ");
        munchieCalories = keyboard.nextInt();
        return(regularCaloriesYouDoEat + munchieCalories);
    }
//-----------------------------------------------------------------------------
    private static int regularMeals() {

        int totalCalories = 0;

        
        System.out.print("How many breakfast calories do you eat : ");
        totalCalories += keyboard.nextInt();
        System.out.print("How many lunch calories do you eat     : ");
        totalCalories += keyboard.nextInt();
        System.out.print("How many dinner calories do you eat    : ");
        totalCalories += keyboard.nextInt();

        return(totalCalories);
    }
//-----------------------------------------------------------------------------
    private static int computeCalories() {

        int age,heightFeet,heightInches,weight;
        int requiredCalories;

        System.out.print("Enter your age in years                : ");
        age = keyboard.nextInt();
        System.out.print("Enter your height in feet and inches   : ");
        heightFeet = keyboard.nextInt();
        heightInches = keyboard.nextInt();
        System.out.print("Enter your weight in pounds            : ");
        weight = keyboard.nextInt();
        
        requiredCalories = computeRequired(age,heightFeet*12 + heightInches,
weight);

        return(requiredCalories);
    }
//-----------------------------------------------------------------------------
    private static int computeRequired(int age,int height,int weight) {

        double caloriesForWeight,caloriesForHeight,caloriesForAge;
        int requiredCalories;

        caloriesForWeight = (66 + 13.7 * weight / 2.2);
        caloriesForHeight = (5 * 2.54 * height);
        caloriesForAge = (6.8 * age);

        requiredCalories = (int)(1.5 * (caloriesForWeight + caloriesForHeight - 
caloriesForAge));

        return(requiredCalories);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================