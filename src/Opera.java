import java.util.ArrayList;

public class Opera extends MusicalShow{
    int choirSize;

    public Opera(Person musicAuthor, String librettoText, String title, int duration, Director director, ArrayList<Actor> listOfActors, int choirSize) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choirSize = choirSize;
    }
}
