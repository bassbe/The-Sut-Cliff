^import java.util.*;
//=============================================================================
public class recursionNIntergers{
//-----------------------------------------------------------------------------
private static Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------------
public static void main(String args[]){


    int total = 0;
    int number = 0;
    System.out.println("What number intergers would you like to add?");
    number = scan.nextInt();

    addInts(number,total);
    
    
 }
 
 public static void addInts(int number, int total){
 

  if(number == 0){
  
    return;
    
      
  }else{
  
      total += number;
      addInts(--number, total);
      
 
  
  }
   
System.out.println("Your number is : " + total);
   
 }
 

}
