//=============================================================================
public class Person {
//-----------------------------------------------------------------------------
    //any constant variables
//-----------------------------------------------------------------------------
    private String personName;
    int personAge;
//-----------------------------------------------------------------------------

    public Person(String name, int age){
    
    personName = name;
    personAge = age;
    
    
    }
//-----------------------------------------------------------------------------

  public String toString() {

        //return(String.format("$%.2f",salary));
        return(personName + " is " + personAge + " years old" );
    }   
//-----------------------------------------------------------------------------
  public int incrementAge(){
  return ++personAge;
    
  }
//-----------------------------------------------------------------------------
    public String getName() {

        return(personName);
    }
//-----------------------------------------------------------------------------
    public int getAge() {
    
        return(personAge);
    }
//=============================================================================
}


/*

The Florida Department of Children and Families need a new program to track information about families they are dealing with. They have already written the main method (which you may not change) and placed it in UseFamily.java. You'll see that for each family they need information about:

The number of people
The names and ages of the members
The total age
Additionally, they need to be able to:
Add people to a family
Track age increments by specifying that it's someone's birthday
Print out the information about the family members
Write two instantiable classes that will allow the main method to work:

A Person class that contains: 
   (done)            -Instance variables to store the name and age of a person
   (done)            -A  default constructor, and a constructor that takes a name and age to initialize the instance variables.
   (done)            -A toString method to return a string representation of the person, formatted ala "Fred is 32 years old".
   (done)           -A mutator method to increment the age of the person
   (done)            -An accessor method to return the name the person
   (done)            -An accessor method to return the age the person
               
UsePerson.java can be used to test your Person class.

A Family class that contains:
				-Instance variables to store the information about the people (maximally 10 people per family)
				-A default constructor that intializes the instance variables to a family of 0 people
				-An IO method to display the family
				-A mutator method to add a person to the family (returning false if there's no more space in the family)
				-A mutator method that makes the necessary changes for a birthday
				-An accessor method to return the number of people
				-An accessor method to return the total age of the people
				
				
Here's what a sample run should look like (with the keyboard input shown in italics) ...
Enter name of next person : Fred
How old is that person    : 32
Enter name of next person : Wilma
How old is that person    : 27
Enter name of next person : Pebbles
How old is that person    : 4
Enter name of next person : Barney
How old is that person    : 8
Enter name of next person : STOP
There are 4 people in the family, with a total age of 71
Fred is 32 years old
Wilma is 27 years old
Pebbles is 4 years old
Barney is 8 years old
Whos birthday is it?      : Wilma
There are 4 people in the family, with a total age of 72
Fred is 32 years old
Wilma is 28 years old
Pebbles is 4 years old
Barney is 8 years old 
You must ...

Write the Person class (1.0%)
Write the Family class (2.0%)


*/