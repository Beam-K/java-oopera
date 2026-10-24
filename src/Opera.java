public class Opera extends MusicalShow{
    int choirSize;

    public Opera(String musicAuthor, String librettoText, String title, int duration, Director director, Actor listOfActors, int choirSize) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choirSize = choirSize;
    }
}
