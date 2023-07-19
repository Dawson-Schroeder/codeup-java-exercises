package rpg;

public class Cat {
    private String name;
    private String type;
    private String sound;
    public String getName(){
        return name;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSound(String type){
        this.type = type;
    }
    public void makeNoise(){
            System.out.printf("%s the %s goes %s%n", name, type, sound);
    }

    public Cat(){
        // this is a no argument constructor (nickname: NoArg)
        // the JavaC compiler if there is no explicit argument constructor in the class the JavaC constructor will compile it for you automatically.
    }
    // use setters if trying to recreate the code below.
    public Cat(String name, String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;

    }
}
