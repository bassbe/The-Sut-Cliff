import java.io.*;
//=============================================================================
public class FileCopyChar {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        try {
            copyFile(args[0],args[1]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
//-----------------------------------------------------------------------------
    private static void copyFile(String fromName,String toName) 
throws IOException {

        FileReader fromReader;
        FileWriter toWriter;
        int aChar;

        fromReader = new FileReader(fromName);
        toWriter = new FileWriter(toName);

        while ((aChar = fromReader.read()) != -1) {
            toWriter.write(aChar);
        }
        fromReader.close();
        toWriter.close();
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
