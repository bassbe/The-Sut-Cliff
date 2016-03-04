//=============================================================================
public class CallVoidReturn {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("Hello World!");
        displayHelpMenu();
        System.out.println("Goodbye World!");
        return;
    }
//-----------------------------------------------------------------------------
    private static void displayHelpMenu() {

        System.out.println("Still no help available yet, sorry");
        return;
//----javac barfs at this line
//      System.out.println("This is dead code");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================