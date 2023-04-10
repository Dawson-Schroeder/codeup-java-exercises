
//main "tab Button"
// sout "tab button" will print System.out.println();
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println();

        int myFavoriteNumber = 999;
        String myString = "3.14159";
        System.out.println(myString);
        long myNumber;
        myNumber = 123L;
        float myNumber2;
        myNumber2 = 3.14F;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // the first code block where x++, the first sout logs 5 and iterates after.
        // the second code block itterates from the jump and outputs 6, 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        // If you assing a value to a numerical variable that is too large for the type
        // it will cut off the numbers to fit the amount of bytes.
        // int x = Integer.MAX_VALUE;
        //x++; // This will result in x = -2147483648
    }
}