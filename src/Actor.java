public class Actor extends Person {

     int numberOfShows;

     public Actor(String name, String surname, Gender gender, int numberOfShows) {
          super(name, surname, gender);
          this.numberOfShows = numberOfShows;
     }
}
