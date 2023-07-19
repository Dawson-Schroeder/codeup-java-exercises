import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileIOLecture {
    public static void main(String[] args) {
        String directory = "data";
        // String filename = "info.txt" was in place of groceries.txt
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                // printStackTrace will basically console log the error to you.
                e.printStackTrace();
            }
        }
        if (!Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // the directory and fie exist now

        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuff Oreos");
        System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(
                    dataFile,
                    // contact.getName + " , " + contact.getNumber
                    moreGroceries,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        // grocery list is created now
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            System.out.println(groceryListFromFile);
            for (int i = 1; i <= groceryListFromFile.size(); i += 1) {
                System.out.println(i + ":" + groceryListFromFile.get(i - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // we have our list. now lets double check the list to see if it has our most important ingredient.
        Boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            // syntax for the for loop: daclaring a new String names line and its looping through lines.
            for (String line : lines) {
                if (line.equals("Powdered Sugar")) {
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // we know if powdered sugar is in the list or not
        if (!hasPowderedSugar) {
            List<String> addPowderedSugar = Arrays.asList("Powdered Sugar");
            try {
                Files.write(
                        dataFile,
                        addPowderedSugar,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // some people dont like double stuffed oreos, changing it to regular

        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for (String line : lines) {
                //
                if (line.equals("Double Stuff Oreos")) {
                    newList.add("Regular Oreos");
                } else {
                    newList.add(line);
                }
            }
            // (where are we listing, what are we listing)
            Files.write(dataFile, newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



