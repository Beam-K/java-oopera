public class Show {
    String title;
    int duration;
    Director director;
    Actor listOfActors;

    public Show(String title, int duration, Director director, Actor listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

}
