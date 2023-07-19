package lecture;

import java.util.ArrayList;

public class ArraysLecture {
    public static void main(String[] args) {
        // setting the limit on items inside the Array:
        int sizeOfArray = 5;
        // building the Array:
        int[] numbers = new int[sizeOfArray];
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = 999;
        numbers[4] = 223;
        // sout the index of the array position you want displayed:
        System.out.println(numbers[3]);
        // using a for loop to display all items in the array:
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
