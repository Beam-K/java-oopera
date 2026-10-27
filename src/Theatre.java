import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Регина", "Олесьева", Gender.FEMALE, 165);
        Actor actor2 = new Actor("Максим", "Руковишников", Gender.MALE, 183);
        Actor actor3 = new Actor("Руслан", "Лудлинк", Gender.MALE, 179);

        Director director1 = new Director("Денис", "Крылов", Gender.MALE, 18);
        Director director2 = new Director("Екатерина", "Ионис", Gender.FEMALE, 7);

        MusicAuthor musicAuthor = new MusicAuthor("Варвара", "Мышкина", Gender.FEMALE);
        Choreographer choreographer = new Choreographer("Анастасия", "Рыбкина", Gender.FEMALE);

        Show ordinary = new Show(
                "Обычное шоу",
                140,
                director1,
                new ArrayList<Actor>()
        );
        Opera opera = new Opera(
                musicAuthor,
                "текст либбретто для оперы",
                "Опера",
                190,
                director2,
                new ArrayList<Actor>(),
                33
        );
        Ballet ballet = new Ballet(
                musicAuthor,
                "текст либретто для баллета",
                "Балет",
                90,
                director1,
                new ArrayList<Actor>(),
                choreographer
        );

        ordinary.addActor(actor1);
        ordinary.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor1);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        ordinary.printActors();
        opera.printActors();
        ballet.printActors();

        ballet.replaceActor(actor2, "Чижиков");
        ballet.printActors();

        /*System.out.println(director2.toString()); можно и так, но это бессмысленно, тк sout автоматически вызывает
        toString() у любого объекта*/
        System.out.println(director2);
        
        ordinary.replaceActor(actor2, "Ябеда");
        ordinary.replaceActor(actor1, actor3.getSurname());

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
