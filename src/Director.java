public class Director extends  Person{
    int height;

    public Director(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
}
