package vehicles;

public class Van extends Vehicle {
    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("engine blowing up: stu-stu-stu... pop");
    }
}
