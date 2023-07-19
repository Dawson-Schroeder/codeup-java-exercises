package rpg;

public class Fighter {
//    public int totalFighters;

    private String name;
    private int hitPoints;
    private int maxDamage;


    public static int armorClass = 15;

    // to access our privates we need getter and setter's.
    // getter
    public String getName(){
        return name;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public int getMaxDamage(){
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }
    public void printStats() {
        System.out.printf("%s has %d hit points and does %d maximum damage. Armor class is %d%n", name, hitPoints, maxDamage, armorClass);
    }

//    public Fighters(){
//        totalFighters++;
//    }
//    public Fighters(){
//        totalFighters++;
//        this.name = name;
//    }
    public Fighter(){
        // this is a no argument constructor (nickname: NoArg)
        // the JavaC compiler if there is no explicit argument constructor in the class the JavaC constructor will compile it for you automatically.
    }
    // use setters if trying to recreate the code below.
    public Fighter(String name, int hitPoints, int maxDamage){
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
//        totalFighters++;

    }

}

