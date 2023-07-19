package vehicles;

public class Vehicle {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise(){
        System.out.println(this.name + " goes -- Honk!");
    }
//    public void breakingDownNoise(){
//        System.out.println("stu-stu-stu... pop");
//    }

}
