package vehicles;

import birds.Bird;
import birds.Finch;
import birds.Goose;
import birds.Quaker;

public class Garage {
/*    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Van();
        vehicles[0].setName("Honda");
        vehicles[1] = new Truck();
        vehicles[1].setName("Cummins");
        vehicles[2] = new Vehicle();
        vehicles[2].setName("Subaru");

        for(Vehicle vehicle : vehicles){
            vehicle.makeNoise();
        }*/
    // protected means the same as default.
    protected Vehicle[] vehicles;
        public void alamCascade(){
            for (Vehicle vehicle : this.vehicles){
                vehicle.makeNoise();
            }
        }
    }


