import java.io.*;
//=============================================================================
public class FileExamine {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int index;
        File oneFile;
        String[] contents;

        oneFile = new File(args[0]);
        if (oneFile.exists()) {
            if (oneFile.isFile()) {
                System.out.println(oneFile + " is a file of length " + 
oneFile.length());
            } else if (oneFile.isDirectory()) {
                System.out.println(oneFile + " is a directory");
                contents = oneFile.list();
                for (index = 0; index < contents.length; index++) {
                    System.out.println("    " + contents[index]);
                }
            } else {
                System.out.println(oneFile + " is weird");
            }
        } else {
            System.out.println(oneFile + " does not exist");
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
