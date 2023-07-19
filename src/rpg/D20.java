package rpg;

public class D20 {

    // static: belongs to whole class, all d20's do this.
    public static int rolld20(){
        return (int) (Math.random()*20) + 1;
    }


}
