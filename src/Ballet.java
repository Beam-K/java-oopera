import java.util.ArrayList;

public class Ballet extends MusicalShow{
    Choreographer choreographer;

    public Ballet(MusicAuthor musicAuthor, String librettoText, String title, int duration, Director director, ArrayList<Actor> listOfActors, Choreographer choreographer) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
