package behavioral.iterator;

import behavioral.iterator.iterators.SongIterator;
import behavioral.iterator.models.SongInfo;

import java.util.Iterator;

public class DiscJockey {

    SongIterator songIterator70s;
    SongIterator songIterator80s;
    SongIterator songIterator90s;

    public DiscJockey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s) {

        this.songIterator70s = songsOfThe70s;
        this.songIterator80s = songsOfThe80s;
        this.songIterator90s = songsOfThe90s;
    }

    public void showSongs() {

        Iterator songs70s = this.songIterator70s.createIterator();
        Iterator songs80s = this.songIterator80s.createIterator();
        Iterator songs90s = this.songIterator90s.createIterator();

        System.out.println("\nSongs of '70's");

        show(songs70s);

        System.out.println("\nSongs of '80's");

        show(songs80s);

        System.out.println("\nSongs of '90's");

        show(songs90s);
    }

    public void show(Iterator iterator) {

        while (iterator.hasNext()) {

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println("Song: " + songInfo.getSongName());
            System.out.println("Band: " + songInfo.getBandName());
            System.out.println("Year: " + songInfo.getYearReleased());
        }

    }
}
