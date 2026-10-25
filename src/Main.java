import java.util.ArrayList;

public class Main {

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

        ballet.replaceActor(actor2, actor3.surname);
        ballet.printActors();

        ordinary.replaceActor(actor2, actor1.surname);
        ordinary.replaceActor(actor1, actor1.surname);

        opera.printLibrettoText();
        ballet.printLibrettoText();


    }
}
