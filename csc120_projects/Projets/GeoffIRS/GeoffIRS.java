import java.util.Scanner;
import java.util.*;
//==============================================================================
public class GeoffIRS {
//------------------------------------------------------------------------------
private static Scanner scan = new Scanner(System.in);
//------------------------------------------------------------------------------
public static void main(String[] args){

 double income = 0;
 double deduction = 0;
 double nextAmount;
 double taxableIncome;
 char taxGroup;
 double tax=0;

do{
     System.out.println("Enter next amount:");
     nextAmount = scan.nextDouble();
     
       if (nextAmount > 0){
    income += nextAmount;
    } else {
      deduction -= nextAmount;
    }
   
  } while(nextAmount != 0);
  
taxableIncome = computeTaxableIncome(income, deduction);
taxGroup = computeTaxGroup(taxableIncome);
tax = computeTax(taxableIncome, taxGroup,tax);
displayOutput( income,  deduction,  taxableIncome,  taxGroup,  tax);

   
}

public static double computeTaxableIncome(double income, double deduction){
   double taxable;
  if(income >= deduction){
   taxable = income - Math.abs(deduction);
  }else{
  taxable = 0;
   
}
 return taxable;
}

public static char computeTaxGroup(double taxableIncome){
 char group;
   if (taxableIncome >= 500000){
       group = 'S';
    }else if(taxableIncome >= 200000){
             group = 'Q';
    }else if(taxableIncome >= 100000){
             group = 'M';
    }else if(taxableIncome >= 50000){
             group = 'A';
    }else if(taxableIncome >= 20000){
             group = 'R';
    }else{
             group = 'P';
             }
             
 return group;            
}

public static double computeTax (double taxableIncome, char taxGroup, double tax ){

    switch(taxGroup){
    case 'S':
    case 'Q':
                tax = taxableIncome * 0.25;
                break;
    case 'M':
                tax = taxableIncome * 0.1;
                break;
    case 'A':
    case 'R':
                tax = taxableIncome * 0.03;
                break;
    case 'P':
                tax = 0.0;
                break;
    default:
                System.out.println("ERROR!");
                

}
 return tax;
}

public static void displayOutput(double income, double deduction, double taxableIncome, char taxGroup, double tax){
     System.out.println("Income:\t" + income);
     System.out.println("Deduction:\t" + deduction);
     System.out.println("Taxable Income:\t" + taxableIncome);
     System.out.println("Tax Group:\t" + taxGroup);
     System.out.println("Tax:\t" + tax);
}
}










