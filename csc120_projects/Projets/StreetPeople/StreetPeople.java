import java.util.*;
import java.util.Scanner;
//==========================================================
public class StreetPeople {
//----------------------------------------------------------
  public static Scanner scan = new Scanner(System.in);
//----------------------------------------------------------
  public static void main(String[] args){

//--initialize the variables and arrays to hold the house #'s and ages
    double houseNumber[];
    double houseAges[][];
    double sumArray[];
    int numberOfHouses;
    int indexHouse;
    int indexAge;
    int indexSum;
    int indexAgeCount;
    int sumIncrement;
    int sumAll = 0;
   
    
    
//--Prompt and input houses in street into array.
    System.out.println("How many houses in the street ?: ");
    numberOfHouses = scan.nextInt();
    houseNumber = new double[numberOfHouses];
    
//--Ask user for house numbers and input into the house# array.
    for(indexHouse = 0; indexHouse < houseNumber.length; indexHouse++){
      System.out.println("What is the next house number? : ");
      houseNumber[indexHouse] = scan.nextDouble();
      }
    houseAges = new double [numberOfHouses][];
   
//--loop ask for the humber of people and their ages.   
     for(indexHouse = 0; indexHouse < houseNumber.length; indexHouse++){
       System.out.println("What how many people live in house " + (houseNumber[indexHouse]));
        houseAges[indexHouse] = new double[(int)scan.nextDouble()];
        
       for(indexAge = 0; indexAge < houseAges[indexHouse].length; indexAge++){
          System.out.println("What is the age of person " + (indexAge+1) );
          houseAges[indexHouse][indexAge] = scan.nextDouble();
          }
          
      }
      
      sumArray = new double [numberOfHouses];
      
      for(indexSum = 0; indexSum < houseAges.length; indexSum++){
        for(indexAgeCount = 0; indexAgeCount < houseAges[indexSum].length; indexAgeCount++){
           sumArray[indexSum] += houseAges[indexSum][indexAgeCount];
           }
   
        System.out.println("House " + houseNumber[indexSum] + " has a total age of " + sumArray[indexSum]);
        
        }
        
     for(sumIncrement = 0; sumIncrement < houseNumber.length; sumIncrement++){
          sumAll += sumArray[sumIncrement];
     }
        System.out.println("The street has a total age of: " + sumAll);
     
  }
}  


        
