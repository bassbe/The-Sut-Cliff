//=============================================================================
public class Person1 {
//-----------------------------------------------------------------------------
    private String name;
    private Person1 loveInterest;
//-----------------------------------------------------------------------------
    public Person1() {

        name = null;
        loveInterest = null;
    }
//-----------------------------------------------------------------------------
    public Person1(String newName) {

        this();
        name = newName;
    }
//-----------------------------------------------------------------------------
    public String toString() {

         String displayString;

         displayString = "The name is " + name;
         if (loveInterest == null) {
             displayString += " and (s)he is lonely";
         } else {
//----Note how an object from the same class can access private parts
             displayString += " and (s)he loves " + loveInterest.name;
         }
        return(displayString);
    }
//-----------------------------------------------------------------------------
    public void setLoveInterest(Person1 newLoveInterest) {

        loveInterest = newLoveInterest;
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
