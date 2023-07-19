package birds;

public class Goose extends Bird {
    // in this example we set noise inside the method of makeNoise
    // inside of bird test you can see we put system.out.println("Honk!")
    public void makeNoise(String noise){
        System.out.println(this.getName() + " -- " + noise);
    }


}
