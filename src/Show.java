import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    void printActors() {
        for (Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }


    void addActor(Actor newActor){
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " уже есть в спектакле!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " успешно добавлен.");
        }
    }


}
