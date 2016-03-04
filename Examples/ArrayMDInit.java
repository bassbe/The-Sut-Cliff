//=============================================================================
public class ArrayMDInit {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        char[][] someWords = {{'E','a','t'},
                              null,
                              {'m','y'},
                              null,
                              {'s','h','o','r','t','s'}};
        int word,character;

        for (word = 0; word < someWords.length; word++) {
            if (someWords[word] != null) {
                for (character = 0; character < someWords[word].length;
character++) {
                    System.out.print(someWords[word][character]);
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================