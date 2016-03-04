import java.util.Scanner;
//==============================================================================
public class I95 {
//------------------------------------------------------------------------------
   private static Scanner scan = new Scanner(System.in);
   final static double SPEED_LIMIT = 65;
//------------------------------------------------------------------------------
   public static void main(String[] args){
   double time;
   double distance;
   double speed;
   userMessages();
   
   
   distance = imputVariables("Enter time to travel: ");
   time = imputVariables("Enter distance to travel: ");
   speed = travelSpeed(distance,time);
   displayOutput(speed);
   }
   
   public static void userMessages(){
   System.out.println("Welcome to I95 Speed Machine!\n");
   System.out.println("You will have to supply:\n"+
    "+The distance you want to travel, in miles:\n"+
    "+The time you have available, in hours:\n");
   }
   
    public static double imputVariables(String prompt){
    System.out.println(prompt);
   double scanIn = scan.nextDouble();
    return scanIn; 
   }
    
    public static double travelSpeed(double distance, double time){
   double numberOfStops = (distance / 100);
//   System.out.println(distance);
  // System.out.println(numberOfStops);
   double restStops = Math.ceil(numberOfStops);
//   System.out.println(restStops);
   double timeForStops = restStops * (5.0/60.0);
//   System.out.println(timeForStops);
   double timeForTravel = time - timeForStops;
//   System.out.println(timeForTravel);
   double speed = distance/timeForTravel;
//   System.out.println(speed);
   return speed;
    }
   
   public static void displayOutput(double speed){
   System.out.println("You will have to travel at " + speed + "mph");
   boolean overTheSpeedLimit = (speed > SPEED_LIMIT);
   System.out.println("Over the speed limit  :" + overTheSpeedLimit);
   }
   
   }