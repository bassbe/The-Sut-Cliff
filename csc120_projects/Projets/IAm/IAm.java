import java.util.*;
import java.util.Scanner;
//=============================================================================
public class IAm {
//-----------------------------------------------------------------------------
private static Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------------
public static void main(String[] args){

int index = 0;
String sentence = "89";
String mySentence = "The qualities are ";
String addition = "0000" ;

System.out.println("Please enter sentences, . to end.");

  while(sentence.charAt(0) != '.' ){
    sentence = scan.nextLine();
     if(sentence.startsWith("I am")){
      addition = sentence.substring(5);
      mySentence = mySentence + ", " + addition;
    }
    
   }
   System.out.println(mySentence);
   
   }
}

  
