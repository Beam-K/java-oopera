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


    void addActor(String name, String surname, Gender gender, int height){
        Actor newActor = new Actor(name, surname, gender, height);
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: Актер " + name + " " + surname + " уже есть в спектакле!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + name + " " + surname + " успешно добавлен.");
        }
    }


}
