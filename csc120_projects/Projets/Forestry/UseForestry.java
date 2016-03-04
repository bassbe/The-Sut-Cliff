import java.util.Scanner;
import java.util.*;
import java.io.*;
//=============================================================================
public class UseForestry {
//-----------------------------------------------------------------------------
    private static Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {
    
//initialize variables for Forest object, name, height and other inputs
    char userInput = ' ';
    Forest myForest = null;
    String forestName;
    int reapHeight = 0;
    String loadName = null;
    
//begins prompt sequence with 'X' as the exit
while((userInput != 'x') && (userInput != 'X' )){
    
// Prompts and runs the commands    
    switch (userInput) {

//sets the first prompt        
        case ' ':
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
          
        break;

//gets name and creates new forrest        
        case 'N':
        case 'n':
         
         System.out.print("What is the name of the forest: ");
         forestName = scan.next();
         myForest = new Forest(forestName);
         
         System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
         userInput = scan.next().charAt(0);
          
         break;

//Displays the output but only if the forest exists        
        case 'D':
        case 'd':
        
        if(myForest != null){
          myForest.display();
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
          }else{
          System.out.println("No Forrest.\n");
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
          }
        break;

        case 'R':
        case 'r':
 
 //reaps, but only if the forest exists. Catches possible exceptions.
       if(myForest != null){
         try{
         System.out.print("What height to reap at  :");  
         reapHeight = scan.nextInt();
         }catch(NumberFormatException e){
         System.out.println("ERROR: Invalid height\n");
         
         System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
         scan.nextLine();
         userInput = scan.next().charAt(0);
         break;
         } catch(InputMismatchException e){
          System.out.println("ERROR: Invalid height\n");
          
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
           scan.nextLine();
          userInput = scan.next().charAt(0);
          break;
         }
//end of try-catch         
         myForest.reap(reapHeight);
           
         System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          scan.nextLine();
         userInput = scan.next().charAt(0);
         break;
//output if there is no forrest         
        }else{
           System.out.print("There is no forest to reap.\n");
        
           System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
            scan.nextLine();
           userInput = scan.next().charAt(0);
        }
          break;
        
     case 'Y':
     case 'y':
//grows the equivalent of a "year".     
     if(myForest != null){
         myForest.yearGrowth();
         
         System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
         userInput = scan.next().charAt(0);
         }else{
         System.out.print("No forest exists.\n");
         System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
         userInput = scan.next().charAt(0);
         }
        break;
        
        
        case 'S': 
        case 's':
//saves the program        
        if(myForest != null){
          try{
          Forest.saveForest(myForest);
          }catch(IOException e){
          System.out.println("Cannot save.");
          }
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
          }else{
          System.out.println("No Forrest exists to save.");
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
          
          }
        break;
        
        case 'L':
        case 'l':
// loads the program        
        try{
          System.out.print("What is the name of the Forest: ");
          loadName = scan.next();
          myForest = Forest.loadForest(loadName);
          
          }catch(IOException e){
          System.out.println("Cannot load.");
          }
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
        break;
    
        default:
          System.out.println("ERROR: Invalid Option.");
          System.out.print("(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it :");
          userInput = scan.next().charAt(0);
        break;
    }
   }
//after x is received and the while loop breaks.   
   System.out.println("Goodbye"); 
   
    

 }
//-----------------------------------------------------------------------------
}
//=============================================================================
//adam