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
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }


    void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " уже есть в спектакле!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " успешно добавлен.");
        }
    }

    void replaceActor(Actor newActor, String surnameForReplace) {
        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (newActor.surname.equals(surnameForReplace)) {
                if (i != listOfActors.indexOf(newActor) && listOfActors.contains(newActor)) {
                    System.out.println("Актер с фамилией " + newActor.surname + "уже играет в этой постановке");
                    return;
                }
                listOfActors.set(i, newActor);
                System.out.println("Актер " + surnameForReplace + " заменен на " + newActor.name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актер с фамилией " + surnameForReplace + " не найден!");
        }
    }
}
