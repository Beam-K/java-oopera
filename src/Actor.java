import java.util.Objects;

public class Actor extends Person {


     int height;

     public Actor(String name, String surname, Gender gender, int height) {
          super(name, surname, gender);
          this.height = height;
     }

     @Override
     public String toString() {
          return "Actor{" +
                  "name=" + name + '\'' +
                  ", surname='" + surname + '\'' +
                  "(" + height + ")" +
                  '}';
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null || getClass() != obj.getClass()) return false;
          Actor newActor = (Actor) obj;
          return Objects.equals(name, newActor.name) &&
                  Objects.equals(surname, newActor.surname) &&
                  (height == newActor.height);

     }

     @Override
     public int hashCode() {
          return Objects.hash(name, surname, height);
     }


}
