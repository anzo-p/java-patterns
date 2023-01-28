package structural.composite;

public class Song extends SongComponent {

    private String songGame;
    private String bandName;
    private int yearReleased;

    public Song(String songGame, String bandName, int yearReleased) {
        this.songGame = songGame;
        this.bandName = bandName;
        this.yearReleased = yearReleased;
    }

    @Override
    public String getSongName() {
        return this.songGame;
    }

    @Override
    public String getBandName() {
        return this.bandName;
    }

    @Override
    public int getYearReleased() {
        return this.yearReleased;
    }

    public void show() {
        System.out.println("Song '" + getSongName() + "' by '" + getBandName() + "' released in " + getYearReleased());
    }
}
