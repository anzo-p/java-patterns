package behavioral.iterator.iterators;

import behavioral.iterator.models.SongInfo;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {

    private ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I will survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);
    }

    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
