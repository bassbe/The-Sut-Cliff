import java.util.*;
import java.io.*;
import java.lang.*;
//=============================================================================
public class ExceptionalPeople{
//-----------------------------------------------------------------------------
  private  Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------------    
    public static void main(String args[]){
    
    Vector[] vec = new Vector[10];
    int index = 0;
    Integer trueValue = 0;
    
    for(index = 0; index < args.length; index++){
    
    
    try{
    
        trueValue  = Integer.parseInt(args[index]);
        
        System.out.println("Converter method says integer OK - " + trueValue);
        vec.add((Integer)args[index]);
       }catch(Exception e){
       
        System.out.println("Catch block says the argument \" " + args[index] + "\"is ignored because " + args[index] );
       
          }
    
       }
    
    for(index = 0; index < vec.length; index++){
    
     if(vec[index] != null){
     
      System.out.println("Item " + (index + 1) + "is" + vec[index]);
     
     }
      

    
    }
    
    }
    
}