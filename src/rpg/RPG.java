package rpg;

public class RPG {
    public static void main(String[] args) {
// instance variables all these fighters will have different stats, these are called instance variables.
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(25);
        fighter2.setMaxDamage(23);
        fighter2.printStats();

//using the constructor.
        Fighter fighter3 = new Fighter("Shrek", 95, 45);
        fighter3.printStats();
        int d20roll = D20.rolld20();
        System.out.println(d20roll);

        Cat cat1 = new Cat("Timmy", "BillyCat", "AHHHH?!");
        cat1.makeNoise();
        int number = Quote.onetofive();
        String noise = Quote.randomQuote();
        System.out.println("It's ya boi " + cat1.getName() + ": " + noise);

        Cat cat2 = new Cat("Tommy-boi", "TomCat", "EHHHH!?");
        cat2.makeNoise();

        Cat cat3 = new Cat("dat-boi", "ChadCat", "wazzup");
        cat3.makeNoise();

//        System.out.println(Fighter.totalFighter);

        // collections
//        ArrayList<Monster> monsterList = new ArrayList<>();
    }
}
