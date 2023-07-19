package birds;

public class Quaker extends Bird {

public void makeNoise(){
    // super.makeNoise() will print out what the super class has.
    // in this case the super class is Bird so it will not print ack-sqeak
    // it will print tweet tweet.
//    super.makeNoise();
    System.out.println(this.getName() + " -- ack-squeak");
}

}

