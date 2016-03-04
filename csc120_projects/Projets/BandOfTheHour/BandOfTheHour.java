import java.util.Scanner;
import java.util.*;
//=============================================================================
public class BandOfTheHour{
//-----------------------------------------------------------------------------
   static Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args){
    
    int indexA, indexB;
    int rowNum;
    int positionNum;
    double bandArray[][];
    char userInput;

  System.out.println("Welcome To The Band Of The Hour");
  System.out.println("-------------------------------");

//-- Enter the number of rows (!>10, !<0)
  System.out.print("Please enter number of rows               :"); 
  rowNum = scan.nextInt();           
//-- idiot proof rowNum                      
    while((rowNum < 0) || (rowNum > 10)){                      
    System.out.print("ERROR: Out of range, try again            :");
    rowNum = scan.nextInt();                         
    }
//-- Initialize first dimension of Array
  bandArray = new double[rowNum][];
  
//--Enter the position numbers
    for(indexA = 0; indexA < bandArray.length; indexA++){
      System.out.print("Please enter number of positions in row " + (char)(65 + indexA) + " :");
      positionNum = scan.nextInt();
//--Check for error in positions
      while((positionNum > 8) || (positionNum < 0)){           
       System.out.print("ERROR: Out of range, try again            :");
       positionNum = scan.nextInt();
      }
      // check to see if it fits my purpose
 //-- set up second dimension
       bandArray[indexA] = new double[positionNum];                
//--initialize array to zero
      for(indexB = 0; indexB < bandArray[indexA].length; indexB++){     
         bandArray[indexA][indexB] = 0.0;
         }
        }
//-- Prompt and read in commands and add space at end
  System.out.print("(A)dd, (R)emove, (P)rint,          e(X)it :");
  userInput = scan.next().charAt(0);
  System.out.println("");

 //--While loop that runs the commands throughout the program
    while((userInput != 'x') && (userInput != 'X')){
//--Switch that defines actions for commands
    switch(userInput){                         
      case 'a':
      case 'A':
      		addMusician(bandArray);
      		System.out.print("(A)dd, (R)emove, (P)rint,          e(X)it :");
            userInput = scan.next().charAt(0);
      		break;
      case 'r':
      case 'R':
            removeMusician(bandArray);
            System.out.print("(A)dd, (R)emove, (P)rint,          e(X)it :");
            userInput = scan.next().charAt(0);
            break;
      case 'p':
      case 'P':
      		printOutput(bandArray);
      		System.out.print("(A)dd, (R)emove, (P)rint,          e(X)it :");
            userInput = scan.next().charAt(0);
      		break;
      case 'x':
      case 'X':
            break;
     default: 
            System.out.print("ERROR: Invalid option, try again          :");
            userInput = scan.next().charAt(0);
            break;
    }
    
     
     
 
   }
    
}    
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

  public static void printOutput(double bandArray[][]){
//--define all variables
  int indexA = 0;
  int indexB = 0;
  int indexSpace = 0;
  int concatCount = 0;
  String spaceCount = "";
  double lineTotal;
  double averages =0;
  
//--First part of loop that prints out A:, B:, C: ... etc
  for(indexA = 0; indexA < bandArray.length; indexA++){
    spaceCount = "";
   System.out.print( (char)(65 + indexA) + ":");
   lineTotal = 0;
   averages = 0;
     while(concatCount < (8- (bandArray[indexA].length))){
           spaceCount += "     ";  
           concatCount++;	
        }
//--Second part of loop that prints out the array positions
    for(indexB = 0; indexB < bandArray[indexA].length; indexB++){
     System.out.printf("%5.1f", bandArray[indexA][indexB]);
//--adds up total values in line
     lineTotal += bandArray[indexA][indexB];
     
    } 
   averages = lineTotal/(bandArray[indexA].length);
   System.out.print(spaceCount); 
   System.out.printf("[%5.1f, %5.1f]", lineTotal, averages);//"[" + lineTotal + ", " + (lineTotal/bandArray[indexA].length) + "]");   
   concatCount = 0;      
   System.out.println("");
                                                   
  }          
//--print for space between end and command prompt.
  System.out.println("");
  
  }

//-----------------------------------------------------------------------------
 public static double[][] addMusician(double[][] bandArray){
 
   //--define all variables
   int indexAddUp = 0;
   int indexA = 0;
   double weight;                 
   char letter;
   int position;
   double lineTotal = 0;
   int rowNum;
   
  //prompts and scans row letter
   System.out.print("Please enter row letter                   :");    
   rowNum = scan.next().charAt(0);
   rowNum = ((int)Character.toUpperCase(rowNum)-65);
  
  //-- check error for rowNum
   while(rowNum > bandArray.length-1){                      
     System.out.print("ERROR: Out of range, try again            :");
     rowNum = scan.next().charAt(0);
     rowNum = ((int)Character.toUpperCase(rowNum)-65);                     
   }
               
//--prompts and reads in position number
   System.out.print("Please enter position number (1 to " + bandArray[rowNum].length + ")     :");
   position = scan.nextInt();                                              
         
//-- idiot proof position constraint
   while((position > bandArray[rowNum].length) || (position < 1)) { 
     System.out.print("ERROR: Out of range, try again            :");
     position = scan.nextInt();
   }
//--check and print error if musician already in position
   if(bandArray[rowNum][position-1] != 0.0) {
      System.out.println("ERROR: There is already a musician there.");
//-- if musician is not there, carry on with adding musician
   } else{
//--prompt and read in weight
       System.out.print("Please enter weight (45.0 to 200.0)       :");    
       weight = scan.nextDouble();

//--idiot proof weight constraint
       while((weight < 45.0) || (weight > 200.0)){                       
         System.out.print("ERROR: Out of range, try again            :");
         weight = scan.nextDouble();
       }      
       lineTotal = 0;
//--loop that adds up line weights
       for(indexAddUp = 0; indexAddUp < bandArray[rowNum].length; indexAddUp++){    
         lineTotal += bandArray[rowNum][indexAddUp]; 
       }
 //--checks the average of the row isn't > 100
       if(((lineTotal+weight)/bandArray[rowNum].length) > 100){           
         System.out.println("ERROR: That would exceed the average weight limit.");
       } else{
 //--add weight to position and print out message and space for command prompt
           bandArray[rowNum][position-1] = weight;                     
           System.out.println("****** Musician added."); 
           System.out.println("");
       }
    }          
                  
    return bandArray; 
}

//-----------------------------------------------------------------------------

public static double[][] removeMusician(double[][] bandArray){
//--define all variables
char letter;
int indexA;
int position;
int rowNum;

 //prompts and scans row letter
   System.out.print("Please enter row letter                   :");    
   rowNum = scan.next().charAt(0);
   rowNum = ((int)Character.toUpperCase(rowNum)-65);
  
  //-- check error for rowNum
   while(rowNum > bandArray.length-1){                      
     System.out.print("ERROR: Out of range, try again            :");
     rowNum = scan.next().charAt(0);
     rowNum = ((int)Character.toUpperCase(rowNum)-65);                     
   }
//--loop that goes through each box of the first dimension of the array
     
//--checks the row letter  = input    
         System.out.print("Please enter position number (1 to " + bandArray[rowNum].length + ")     :");
         position = scan.nextInt();   
//--idiot proof position constraint
         while((position > bandArray[rowNum].length) || (position < 1)) { 
                    System.out.print("ERROR: Out of range, try again            :");
                    position = scan.nextInt();
         } 
//--vacant position check for constraint
          if(bandArray[rowNum][position-1] == 0.0){                
            System.out.println("ERROR: That position is vacant.");
            System.out.println("");
          
          }else{
//--remove musician
            bandArray[rowNum][position-1] = 0.0;                  
            System.out.println("****** Musician removed.");
            System.out.println("");
          
               }
          
        
       
     
    
//--return array arrow
     return bandArray;                                    
}

}
//=============================================================================
