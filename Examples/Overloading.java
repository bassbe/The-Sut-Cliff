//=============================================================================
public class Overloading {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        PrintBookParts();
        PrintBookParts(2);
        PrintBookParts(4,6);
        PrintBookParts('8');
        PrintBookParts('B');
    }
//-----------------------------------------------------------------------------
    private static void PrintBookParts() {

        System.out.println("Preface");
    }
//-----------------------------------------------------------------------------
    private static void PrintBookParts(int chapterNumber) {

        System.out.println("Chapter " + chapterNumber);
    }
//-----------------------------------------------------------------------------
    private static void PrintBookParts(int start,int end) {

        int chapterNumber;

        for (chapterNumber = start; chapterNumber <= end; chapterNumber++) {
            PrintBookParts(chapterNumber);
        }
    }
//-----------------------------------------------------------------------------
    private static void PrintBookParts(char appendixNumber) {

        if (appendixNumber >= '1' && appendixNumber <= '9') {
            PrintBookParts((int)appendixNumber - (int)'0');
        } else {
            System.out.println("Appendix " + appendixNumber);
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================