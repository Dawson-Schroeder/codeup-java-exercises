public class ExceptionHandlingLecture {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[99]);
        } catch(Exception e) {
            System.out.println("After the error happens...");
        }
    }
}
