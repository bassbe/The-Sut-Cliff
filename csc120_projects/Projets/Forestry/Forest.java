import java.io.*;
import java.util.*;
//=============================================================================
public class Forest implements Serializable{
//-----------------------------------------------------------------------------
//creates variables and constants
    private final int MAX_NUM_TREES = 10;
    private String name;
    private Tree[] arrayOfTrees;
    int index;
//-----------------------------------------------------------------------------

public Forest(String forestName){
//Constructor class that takes a name and creates an array of trees().
    index = 0;
    name = forestName;
    arrayOfTrees = new Tree[MAX_NUM_TREES];

     for(index = 0; index < arrayOfTrees.length; index++){
 
        arrayOfTrees[index] = new Tree();
 
     }
}
//-----------------------------------------------------------------------------
  
public void display(){
// displays the array of trees and the index
     index = 0;

     if(name != null){
   
        System.out.println(name);
        for(index = 0; index < arrayOfTrees.length; index ++){
           System.out.printf("%2d   :   %s\n", (index + 1), arrayOfTrees[index]);
       }
     }else{
       System.out.println("No forest.");
  }
  
}
//-----------------------------------------------------------------------------
public void yearGrowth(){
//grows each tree in the array
    index = 0;
   
    for(index = 0; index < arrayOfTrees.length ; index ++){
   
       arrayOfTrees[index].grow();
   }

}
//-----------------------------------------------------------------------------
public void reap(int reapHeight){
 //reaps the trees and prints out the old and new information
    index = 0;
 
 
    for(index = 0; index < arrayOfTrees.length; index++){
 
      if(arrayOfTrees[index].getHeight() >= reapHeight){
  
         System.out.println("Cut " + (index+1) + " : " + arrayOfTrees[index] );
         arrayOfTrees[index] = new Tree();
         System.out.println("New " + (index+1) + " : " + arrayOfTrees[index] );
  
       }
    }

}
//-----------------------------------------------------------------------------
    public static void saveForest(Forest forest) throws IOException {
//saves the forest
        String name = forest.getName();
        ObjectOutputStream toStream;
        
        toStream = new ObjectOutputStream(new FileOutputStream(name));
        toStream.writeObject(forest);
        toStream.close();
    }
 
//-----------------------------------------------------------------------------
    public static Forest loadForest(String fileName) throws IOException {
//loads the forest
        ObjectInputStream fromStream = null;
        Forest local;

        fromStream = new ObjectInputStream(new FileInputStream(fileName));
        try {
            local = (Forest)fromStream.readObject();
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return(null);
        }finally{
            try {
                if (fromStream != null) {
                    fromStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return(null);
            }
        }
        return(local);
    }
//-----------------------------------------------------------------------------

public  String getName(){

    return (name);
}
//-----------------------------------------------------------------------------
}
//=============================================================================

