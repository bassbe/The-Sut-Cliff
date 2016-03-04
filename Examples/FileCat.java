import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileCat {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String fromFileName;
        FileReader fromReader;
        int aChar;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.next();

        try {
            fromReader = new FileReader(fromFileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            aChar = fromReader.read();
            while (aChar != -1) {
                System.out.print((char)aChar);
                aChar = fromReader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            fromReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
