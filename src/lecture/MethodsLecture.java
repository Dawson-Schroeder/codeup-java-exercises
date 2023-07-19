package lecture;

public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("Dawson"));
        System.out.println(sayHello());
        System.out.println(returnThree());
        System.out.println(highFive("Dawson", "YoBooty"));
        System.out.println(highFive());
        count(5);

    }



    public static String sayHello(){
        String message = "Hello... Who are you?";
        return message;
    }
    public static String sayHello(String name) {
        String message = "Hello, " + name + "?";
        return message;
    }
    public static int returnThree(){
        return 3;
    }
    public static String highFive(){
        return "nobody wants to touch your hand";
    }
    public static String highFive(String name1, String name2){
        return name1 + " gives " + name2 + " a high five";
    }
    public static String changeName(String name){
        name = "Derndider";
        return name;
    }
    // recursion - look into this a lot more.
    public static void count(int n){
        if (n <= 0){
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n -1);
    }





}
