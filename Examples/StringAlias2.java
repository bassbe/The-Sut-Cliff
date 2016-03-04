//=============================================================================
public class StringAlias2 {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String myName;
        String anotherOfMyName;
        String aNewName;
        String alsoANewName;

        myName = "Geoff";
        anotherOfMyName = "Geoff";
        aNewName = new String("Geoff");
        alsoANewName = aNewName;

        System.out.println("Which ones == which ones?");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================