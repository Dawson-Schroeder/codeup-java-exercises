package util;

public class BigfootUtils {
    public static int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        return (int) (Math.random() * max) + min;
    }
}
