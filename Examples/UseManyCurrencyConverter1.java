import java.util.Scanner;
//=============================================================================
public class UseManyCurrencyConverter1 {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        double todaysRate;
        double dollars;
        double rands,aussieDollars;
        CurrencyConverter1 randConverter,anotherConverter;

        randConverter = new CurrencyConverter1();
        System.out.print("What is today's Rand exchange rate? ");
        todaysRate = keyboard.nextDouble();
        randConverter.setExchangeRate(todaysRate);

        anotherConverter = new CurrencyConverter1();
        System.out.print("What is today's AUD exchange rate?  ");
        todaysRate = keyboard.nextDouble();
        anotherConverter.setExchangeRate(todaysRate);

        System.out.print("How much money do you have in $s? ");
        dollars = keyboard.nextDouble();
        rands = randConverter.fromDollars(dollars);
        aussieDollars = anotherConverter.fromDollars(dollars);
        System.out.printf("That's R%.2f and AU$%.2f\n",rands,aussieDollars);

//----Consider what happens if you comment out this line
        anotherConverter = new CurrencyConverter1();
        System.out.print("What is today's NZ$ exchange rate?  ");
        todaysRate = keyboard.nextDouble();
        anotherConverter.setExchangeRate(todaysRate);
        System.out.printf("That's NZ$%.2f\n",anotherConverter.fromDollars(
dollars));

    }
//-----------------------------------------------------------------------------
}
//=============================================================================