import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(Person musicAuthor, String librettoText, String title, int duration, Director director,
                       ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void PrintLibrettoText(){
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
