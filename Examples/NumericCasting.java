//=============================================================================
public class NumericCasting {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        byte beatsPerBar = 4;
        int barsInSong = 200;
        long beatsInSong;
        float timePerBeat;
        double totalTime;
        short barsPerPageOfMusic;
        double pagesOfMusic;
        int paperPages;

        timePerBeat = (float)1.43652219;

//----Compute length of song
        beatsInSong = beatsPerBar * barsInSong;
        totalTime = timePerBeat * beatsInSong;
        System.out.println("Total song time is " + totalTime);

//----Compute amount of printing
        barsPerPageOfMusic = 12;
        pagesOfMusic = (double) barsInSong / barsPerPageOfMusic;
        System.out.println("Printing takes " + pagesOfMusic + " pages");

    }
//-----------------------------------------------------------------------------
}
//=============================================================================