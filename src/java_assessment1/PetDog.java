package java_assessment1;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion {
    public boolean trained;

    public PetDog(String name, String type, boolean trained){
        super(name, type);
        this.trained = trained;
    }
    public boolean isTrained(){
        return trained;
    }

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

    public static void allSnuggle(ArrayList<PetDog> dogs){
        for (PetDog dog : dogs){
            System.out.println(dog.snuggle());
        }
    }


}
