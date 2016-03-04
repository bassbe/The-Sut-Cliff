import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileTextEdit {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);

    private static final int MAX_LINES = 100;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        String[] lines = new String[MAX_LINES];
        int numberOfLines;

        if (args.length != 1) {
            System.out.println("Must provide a file name");
            return;
        }

        try {
            numberOfLines = readTextFile(args[0],lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        numberOfLines = editLines(lines,numberOfLines);

        try {
            writeTextFile(args[0],lines,numberOfLines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
//-----------------------------------------------------------------------------
    private static int readTextFile(String fileName,String[] lines) 
throws IOException {

        BufferedReader fromBufferedReader;
        String oneLine;
        int numberOfLines;

        fromBufferedReader = new BufferedReader(new FileReader(fileName));

        numberOfLines = 0;
        oneLine = fromBufferedReader.readLine();
        while (oneLine != null) {
            lines[numberOfLines] = oneLine;
            numberOfLines++;
            oneLine = fromBufferedReader.readLine();
        }
        fromBufferedReader.close();
        return(numberOfLines);
    }
//-----------------------------------------------------------------------------
    private static void writeTextFile(String fileName,String[] lines,
int numberOfLines) throws IOException {

        PrintWriter toPrintWriter;
        int lineNumber;

        toPrintWriter = new PrintWriter(new FileOutputStream(fileName));

        for (lineNumber = 0; lineNumber < numberOfLines; lineNumber++) {
            toPrintWriter.println(lines[lineNumber]);
        }

        toPrintWriter.close();
    }
//-----------------------------------------------------------------------------
    private static int editLines(String[] lines,int numberOfLines) {

        char option;
        int editLineNumber;
        int lineNumber;

        do {
            System.out.print("(L)ist, (D)elete, (A)dd, (C)hange, e(X)it : ");
            option = Character.toUpperCase(keyboard.nextLine().charAt(0));
            switch (option) {
                case 'L':
                    for (lineNumber = 0; lineNumber < numberOfLines; 
lineNumber++) {
                        System.out.println(lineNumber + " " +
lines[lineNumber]);
                    }
                    break;
                case 'D':
                    editLineNumber = getLineNumber(numberOfLines);
                    for (lineNumber = editLineNumber+1; 
lineNumber < numberOfLines; lineNumber++) {
                        lines[lineNumber-1] = lines[lineNumber];
                    }
                    numberOfLines--;
                    break;
                case 'A':
                    editLineNumber = getLineNumber(numberOfLines+1);
                    for (lineNumber = numberOfLines;
lineNumber >= editLineNumber; lineNumber--) {
                        lines[lineNumber+1] = lines[lineNumber];
                    }
                    numberOfLines++;
                    System.out.print("New line : ");
                    lines[editLineNumber] = keyboard.nextLine();
                    break;
                case 'C':
                    editLineNumber = getLineNumber(numberOfLines);
                    System.out.print("New line : ");
                    lines[editLineNumber] = keyboard.nextLine();
                    break;
                case 'X':
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (option != 'X');

        return(numberOfLines);
    }
//-----------------------------------------------------------------------------
    private static int getLineNumber(int lastLineNumber) {

        int lineNumber;

        do {
            System.out.print("Line number: ");
            lineNumber = keyboard.nextInt();
            keyboard.nextLine();
        } while (lineNumber < 0 || lineNumber > lastLineNumber);

        return(lineNumber);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
