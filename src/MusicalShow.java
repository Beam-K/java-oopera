public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(Person musicAuthor, String librettoText, String title, int duration, Director director,
                       Actor listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void PrintLibrettoText(){
        System.out.println(librettoText);
    }
