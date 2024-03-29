package behavioral.iterator.iterators;

import behavioral.iterator.models.SongInfo;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {

    SongInfo[] bestSongs;

    int ixBestSongs = 0;

    public SongsOfThe80s() {

        bestSongs = new SongInfo[3];

        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears for Fears", 1985);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs[ixBestSongs] = songInfo;

        ixBestSongs++;
    }

    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
