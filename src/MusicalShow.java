import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(MusicAuthor musicAuthor, String librettoText, String title, int duration, Director director,
                       ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibrettoText(){
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return "musicAuthor{" +
                "name - " + musicAuthor.name +
                "surname - "+ musicAuthor.surname+
                '}';
    }
}
