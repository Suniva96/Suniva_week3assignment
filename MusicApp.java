class Song {
     String title;
     String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
}

class PopSong extends Song {
    public PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Pop song" + title + " by " + artist + " is playing now!");
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println(" Rock song" + title + " by " + artist + "!");
    }
}

class JazzSong extends Song {
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("  jazz Song: " + title + " by " + artist + " is playing.");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = new Song[5];

        playlist[0] = new PopSong("Shape of You", "Ed Sheeran");
        playlist[1] = new RockSong("Yellow", "Coldplay");
        playlist[2] = new JazzSong("Take Five", "Dave Brubeck");
        playlist[3] = new PopSong("Bad Guy", "Billie Eilish");
        playlist[4] = new RockSong("I wanna be yours", "Artic Monkey");

        for (Song song : playlist) {
            song.play();
        }
    }
}

