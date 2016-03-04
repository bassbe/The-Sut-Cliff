import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FilePrintf {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        PrintWriter toPrintWriter;

        if (args.length != 1) {
            System.out.println("Must provide a file name");
            return;
        }

        try {
            toPrintWriter = new PrintWriter(new FileOutputStream(args[0]));
            toPrintWriter.printf("The value is %8.2f\n",Math.PI);
            toPrintWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
