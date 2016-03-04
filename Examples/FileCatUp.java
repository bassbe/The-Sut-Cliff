import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileCatUp {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {

        String fromFileName;
        FileReader fromReader;
        int aChar;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.next();

        fromReader = new FileReader(fromFileName);
        while ((aChar = fromReader.read()) != -1) {
            System.out.print((char)aChar);
        }
        fromReader.close();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
