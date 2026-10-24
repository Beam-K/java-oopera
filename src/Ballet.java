public class Ballet extends MusicalShow{
    String choreographer;

    public Ballet(String musicAuthor, String librettoText, String title, int duration, Director director, Actor listOfActors, String choreographer) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
