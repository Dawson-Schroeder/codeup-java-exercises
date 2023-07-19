package birds;

public class BirdTest {
    public static void main(String[] args) {

        // setting eithout a constructor
        Quaker quaker = new Quaker(/*if using a constructor the name will go here instead of whats below*/);
        quaker.setName("Quaker");
        quaker.makeNoise();

        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();

        Goose goose = new Goose();
        goose.setName("Goose");
        goose.makeNoise("Honk!");

        Bird gooseTim = new Goose();
        gooseTim.setName("Tim Thee Goose");
        gooseTim.makeNoise();

    }
}
