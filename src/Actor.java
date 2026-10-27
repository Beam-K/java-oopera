import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }



    @Override
    public String toString() {
        return "Actor{" +
                "name=" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                "(" + height + ")" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor newActor = (Actor) obj;
        return Objects.equals(getName(), newActor.getName()) &&
                Objects.equals(getSurname(), newActor.getSurname()) &&
                (height == newActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
