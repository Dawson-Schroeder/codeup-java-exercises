package java_assessment1;

import java.util.ArrayList;

public class PetDogTest {
    public static void main(String[] args) {
        PetDog myDog = new PetDog("Buddy", "Golden Retriever", true);
        System.out.println("first: " + myDog.snuggle());

        PetDog dog1 = new PetDog("Fido", "Jack Russel", false);
        PetDog dog2 = new PetDog("Rufus", "Poodle", false);
        PetDog dog3 = new PetDog("Buddy", "Pitbul", true);
        ArrayList<PetDog> dogs = new ArrayList<PetDog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        PetDog.allSnuggle(dogs);
    }
}
