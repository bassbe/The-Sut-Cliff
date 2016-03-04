import java.util.Scanner;
import java.util.*;
//==============================================================================
public class FibPrime {
//------------------------------------------------------------------------------
    public static Scanner scan = new Scanner (System.in);
    private final static int MAX_ARRAY_NUM = 10;
//------------------------------------------------------------------------------
    public static void main(String[] args){

//--Necessary Variables
int indexDoWhile = 0;
int numArray[] = new int[MAX_ARRAY_NUM];
int elementNums = 0;
int index = 0;
int check = 0;


//-- Prompt user to enter the numbers
   System.out.print("Please enter the numbers (0 to stop): ");
//--do-while loop to prompt users for values
    do{
     numArray[indexDoWhile] = scan.nextInt();
     indexDoWhile++;
     elementNums++;
        
 }while(indexDoWhile < MAX_ARRAY_NUM && numArray[indexDoWhile -1] != 0);
 
 
 for(index = 0; index < elementNums; index++){
   System.out.println("The array position value of cell " + (index + 1) +" is " +numArray[index]);
   }
 
 for(index = 0; index < elementNums; index++){
   System.out.println("Is " + numArray[index] + " Prime? : " + isPrime(numArray[index]));
   
/*for (check = 0; check < numArray.length(); check++;){
    
   if(isPrime(numArray[check]) && isFib(numArray[check])){
    System.out.println(numArray[check] + " is Fibonacci and is Prime.");
    }else if(isPrime(numArray[check]) = false && isFib(numArray[check])= false){ 
    System.out.println(numberArray[check] + " is not Fibonacci and is not Prime.");
      } else if (isPrime(numArray[check]) = false && isFib(numArray[check]) = true ){
    System.out.println(numberArray[check] + " is Fibonacci and not prime. ");
    } else if (isPrime(numArray[check]) = true && isFib(numArray[check]) = false ){
    System.out.println((numArray[check]) + " is not Fibonacci and is not prime. ");
    }
    check++;
    
    }*/ // for and if statements that go through the array to check and print out values.
    

}
}
//=======================================================================================
 //-- determine if the number is prime.
private static boolean isPrime(int number){

  int count;
  int increment = 3;
  boolean state = true;
  
  for(count = 0; count < Math.sqrt(number); count++){
    if((number % 2 == 0) && (number != 2)){
    state = false;
    }else if ((number % increment == 0) && (number != increment) && (number != 2)){
    state = false;
    increment += 2;
    }
   } 
 return state; 
}

//---------------------------------------------------------------------------------------- 
 
 private static boolean isFib(int number){

 
 
 
 }
 
  }
//-- end of class FibPrime
 
 
 


    