import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileCatUpMain {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String fromFileName;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.next();

        try {
            catFile(fromFileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//-----------------------------------------------------------------------------
    private static void catFile(String fileName) throws IOException {

        FileReader fromReader;
        int aChar;

        fromReader = new FileReader(fileName);

        while ((aChar = fromReader.read()) != -1) {
            System.out.print((char)aChar);
        }
        fromReader.close();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
