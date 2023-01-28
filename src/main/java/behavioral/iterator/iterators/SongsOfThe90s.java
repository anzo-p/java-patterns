package behavioral.iterator.iterators;

import behavioral.iterator.models.SongInfo;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the wet Sprocket", 1991);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.put(bestSongs.size(), songInfo);
    }

    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
