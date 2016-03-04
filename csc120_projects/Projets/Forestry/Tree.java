import java.util.Random;
import java.util.*;
import java.io.*;

//=============================================================================
public class Tree implements Serializable{
//-----------------------------------------------------------------------------
//creates the variables as the 
  private double height;
  private double growthRate;
  private static Random rand = new Random();
  final double MIN_HEIGHT = 1;
  final double MIN_GROWTH_RATE = 0.5;
  final double MAX_HEIGHT = 5;
  final double MAX_GROWTH_RATE = 1.0;
  
  
//-----------------------------------------------------------------------------

 public Tree() {
//creates tree with a height and a growth rate 
    Random rand = new Random();
  
    height = (MIN_HEIGHT + ((Math.random() * (MAX_HEIGHT - MIN_HEIGHT))));
    growthRate = (MIN_GROWTH_RATE + (Math.random() * (MAX_GROWTH_RATE - MIN_GROWTH_RATE)));
    
 
 }
 
 public double grow(){
//tree grows and returns height

   height = height * (1 + growthRate);
   return height;
 
 
 }
 
 public double getHeight(){
 
   return (height);
  
 }

public double getGrowthRate(){

   return (growthRate);

}

public String toString(){
//toString formats the output with height and growthrate

  return (String.format("%7.2f (%2d%% pa)", height, ((int)(growthRate * 100))));
 
}
 
 
 






}
//=============================================================================