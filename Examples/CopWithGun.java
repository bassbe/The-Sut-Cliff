import java.util.Scanner;
//=============================================================================
public class CopWithGun {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Cop vicMackey;
        Cop dannySofer;
        Gun firstGun;

        vicMackey = new Cop("Vic Mackey");
        dannySofer = new Cop("Danny Sofer");
        firstGun = new Gun("Beretta",10);
        vicMackey.setGun(firstGun);
        System.out.println(vicMackey);
        System.out.println(dannySofer);
        System.out.println("Better give Vic some bullets ...");
        keyboard.nextLine();

        vicMackey.loadGun();
        System.out.println(vicMackey);
        System.out.println(dannySofer);
        keyboard.nextLine();

        System.out.println("Vic goes balistic ...");
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        System.out.println(vicMackey);

        keyboard.nextLine();
        System.out.println("Vic gives Danny his gun ...");
        dannySofer.setGun(firstGun);
        System.out.println(vicMackey);
        System.out.println(dannySofer);
        System.out.println("Whoops, they're sharing a gun");
        keyboard.nextLine();

        System.out.println("Vic gets a new gun");
        vicMackey.setGun(new Gun("Ruger",16));
        vicMackey.loadGun();
        System.out.println(vicMackey);
        System.out.println(dannySofer);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
