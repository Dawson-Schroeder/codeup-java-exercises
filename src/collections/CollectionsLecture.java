package collections;

import rpg.Monster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class CollectionsLecture {
    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        Monster frostGiant = new Monster("Frost Giant", 15, 138, 25);
        Monster goblin = new Monster("Goblin", 15, 7, 5);
        Monster werewolf = new Monster("Werewolf", 11, 58, 7);

       /* ArrayList<Monster> monsterList = new ArrayList<>();
        // with arrays we have to assign values to variables
        // array syntax is: monsterArray[0] = blueDragon;

        // With lists we can use the .add() method to add elements one at a time.
        monsterList.add(orc);
        monsterList.add(ogre);
        monsterList.add(blueDragon);*/

        //we could also create an arrayList, initialize it, and add items to it all at once:
        ArrayList<Monster> monsterList = new ArrayList<>(List.of(orc, ogre, blueDragon));



        // looping over an array list, same syntax as for an array
        for(Monster monster : monsterList) {
            System.out.println(monster.getName());
        }
        // instead of a length property, Lists have a size method
        System.out.println(monsterList.size());
        // to access an array element, use bracket notation.
        // for lists, use .get() method and pass the method the index
        monsterList.get(1).getName();


        // Hash Maps
        // HashMap<type of key, Value>
        HashMap<String, Integer> careerWins = new HashMap();
        // adding elements to has map use a .put() method.
        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);
        // to retrieve an item from a hashmap use .get() and pass it the key. will output 1366
        System.out.println(careerWins.get("Gregg PopoVich"));
        // replacing the value og Gregg's wins from 1366 to 1367.
        careerWins.replace("Gregg Popovich", 1367);
        System.out.println(careerWins.get("Gregg Popovich"));

        // hashmap:
//        HashMap<String, Monster> monsterMap = new HashMap<>();

        // to add multiple entries at once, we can use Map.ofEntries()
        Map <String, Monster> monsterMap = Map.ofEntries(
                entry("Orc", orc),
                entry("Blue Dragon", blueDragon),
                entry("Ogre", ogre),
                entry("Werewolf", werewolf),
                entry("Goblin", goblin),
                entry("Frost Giant", frostGiant)
        );
        // Map.ofEntries returns an un-modifiable map
        // this is by design for preformance reasons
        // if i want to moddify it i must convert back to HashMap():
        Map<String, Monster> monsterHashMap = new HashMap<>(monsterMap);
        // now the hashmap is modifiable again.
        // adding a new object to HashMap:
        monsterHashMap.put("Skeleton", new Monster("Skeleton", 13, 13, 5));

        // looping over a hashmap directly is not possible. Instead I have to generate sets
        // and than loop over the sets.
        // a set is an unordered collection of unique objects

        //if i want to loop over all the hashmaps entries i can create an EntrySet
        // an EntrySet is a set of entry objects.
        // entry objects have two properties which are key/value, and getters for both key and value
        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            System.out.printf("The key is %s%n", monsterEntry.getKey());
            System.out.printf("%s has %d hit points:%n", monsterEntry.getValue().getName(), monsterEntry.getValue().getHitPoints());
        }

        // there is also a forEach loop// -> is the Java equivilent to a arrow function
        monsterHashMap.forEach((name, monster)-> {
            System.out.printf("%s has %d hit points", name, monster.getHitPoints());
        });

        // you can also get a set of the keyys using the .keySet method
        // you can get a collection of values using the .values() method.


    }
}
