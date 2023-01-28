package structural.composite;

/*
    Composite
    - Generalisation of iterating over composite of composites of arbitrary depth, ie a tree
    - Depth may be 1 as in there might also be only Leafs

    Adding an element means
    - Extending Component or 'Node' class
    - Adding / removing instances of it as children to nodes wherever in the tree
 */

public class Runner {

    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial", "lorem ipsum");

        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "jaah jaah");

        SongComponent popularMusic = new SongGroup("POP", "qwerty whatever..");

        SongComponent allSongs = new SongGroup("Song List", "of Song Lists of Song Lists ...");

        allSongs.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(popularMusic);

        popularMusic.add(new Song("Sowing the Seedsd of Love", "Tears for Fears", 1989));
        popularMusic.add(new Song("Black or White", "Michael Jackson", 1992));

        allSongs.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabbath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey insaneBilly = new DiscJockey(allSongs);

        insaneBilly.getSongList();
    }
}
