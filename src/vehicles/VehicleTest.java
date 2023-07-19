package vehicles;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle toyota = new Vehicle();
        toyota.setName("Toyota");
        toyota.makeNoise();
        System.out.println(toyota.getName());

        Truck mac = new Truck();
        mac.setName("Mac Trucks");
        mac.makeNoise();
        System.out.println(mac.getName());

        Van van = new Van();
        van.setName("Tina");
        van.breakingDownNoise();

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Van();
        garage.vehicles[1] = new Truck();
        garage.vehicles[2] = new Vehicle();
        garage.alamCascade();


    }


}
