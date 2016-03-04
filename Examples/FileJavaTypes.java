import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileJavaTypes {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final String DATA_FILE = "DATAFILE";
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        try {
            writeSomeData(DATA_FILE);
            System.out.println(
"\n---- Have a look at the file then press return----");
            keyboard.nextLine();
            readSomeData(DATA_FILE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
//-----------------------------------------------------------------------------
    private static void writeSomeData(String fileName) throws IOException {

        DataOutputStream toDataOutputStream;
        char dataType;
        char aChar;
        int anInt;
        double aDouble;

        toDataOutputStream = new DataOutputStream(new FileOutputStream(
fileName));

        do {
            System.out.print("(C)haracter, (I)nteger, (D)ouble, or e(X)it : ");
            dataType = Character.toUpperCase(keyboard.next().charAt(0));
            toDataOutputStream.writeChar(dataType);
            System.out.print("    Enter data : ");
            switch (dataType) {
                case 'C':
                    aChar = keyboard.next().charAt(0);
                    toDataOutputStream.writeChar(aChar);
                    break;
                case 'I':
                    anInt = keyboard.nextInt();
                    toDataOutputStream.writeInt(anInt);
                    break;
                case 'D':
                    aDouble = keyboard.nextDouble();
                    toDataOutputStream.writeDouble(aDouble);
                    break;
                case 'X':
                    break;
                default:
                    System.out.println("Invalid data type");
                    break;
            }
        } while (dataType != 'X');
        toDataOutputStream.close();

        keyboard.nextLine();
    }
//-----------------------------------------------------------------------------
    private static void readSomeData(String fileName) throws IOException {

        DataInputStream fromDataInputStream;
        char dataType;
        char aChar;
        int anInt;
        double aDouble;

        fromDataInputStream = new DataInputStream(new FileInputStream(
fileName));

        while (fromDataInputStream.available() > 0) {
            dataType = fromDataInputStream.readChar();
            switch (dataType) {
                case 'C':
                    aChar = fromDataInputStream.readChar();
                    System.out.println("Got a character " + aChar);
                    break;
                case 'I':
                    anInt = fromDataInputStream.readInt();
                    System.out.println("Got an integer  " + anInt);
                    break;
                case 'D':
                    aDouble = fromDataInputStream.readDouble();
                    System.out.println("Got a double    " + aDouble);
                    break;
                case 'X':
                    break;
                default:
                    System.out.println("Invalid data type");
                    break;
            }
        }

        fromDataInputStream.close();
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
