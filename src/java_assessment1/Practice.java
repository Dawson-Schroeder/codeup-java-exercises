package java_assessment1;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        System.out.println(subtractTen(15));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        ArrayList<Integer> multipliedNumbers = Practice.multiplyAll(3, numbers);
        System.out.println(multipliedNumbers);
    }
    public static double subtractTen(double x){
        return x - 10;
    }
    public static double average(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return (double) sum / arr.length;
    }
    // in class averge\/
    /*public static double average2(int[] numbers){
        int size = numbers.length;
        double total = 0;
        for (double num : numbers){
            total+=num;
        }
        total /= size;
        return total;
    }*/
    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for( Integer num : numbers){
            result.add(num * multiplier);
        }
        return result;
    }

}
