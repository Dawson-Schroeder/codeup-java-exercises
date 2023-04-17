import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] personsArray, Person person){
        Person[] newPersonsArray = Arrays.copyOf(personsArray, personsArray.length+1);
        newPersonsArray[newPersonsArray.length-1] = person;
        return newPersonsArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("Alex");
        persons[1] = new Person("Khaled");
        persons[2] = new Person("Olivia");

        for (Person person : persons){
            person.sayHello();
        }

        Person[] biggerPersonsArray = addPerson(persons, new Person("Luigi"));
        biggerPersonsArray[biggerPersonsArray.length-1].sayHello();
    }
}
