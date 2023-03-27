package behavioral.iterator;

/*
    Iterator
    - Uniform way for sequential access to different kinds of collections

    Adding iterable means
    - Implementing another SongIterator
 */

import behavioral.iterator.iterators.SongsOfThe70s;
import behavioral.iterator.iterators.SongsOfThe80s;
import behavioral.iterator.iterators.SongsOfThe90s;

public class Runner {
    public static void main(String[] args) {

        SongsOfThe70s songsOfThe70s = new SongsOfThe70s();
        SongsOfThe80s songsOfThe80s = new SongsOfThe80s();
        SongsOfThe90s songsOfThe90s = new SongsOfThe90s();

        DiscJockey meatDaddy = new DiscJockey(songsOfThe70s, songsOfThe80s, songsOfThe90s);

        meatDaddy.showSongs();
    }
}

