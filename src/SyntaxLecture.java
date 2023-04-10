public class SyntaxLecture {

    public static void main(String[] args) {
        // Declaring comments /* this is a multiline comment */
        int weight;
        // initialization after declaration
        weight = 12;
        // Declare and initialize at once
        String breed = "Toy Spaniel";
        String name = "Grinch";
        int cuteness = 10;
        // A statement
        // JVM, do something
        System.out.println(name + " is a " + breed);

        // very small numbers: byte database
        byte smol = 12;
        System.out.println(smol);
        // declare a long: can hold very big numbers
        long bigNumber;
        // assign the small value to the large variable
        // "pour the small bucket into the large bucket"
        bigNumber = smol;
        System.out.println(bigNumber);
        // ASSIGN A BIG VALUE TO THE BIG BUCKET
        bigNumber = 9000000000L;
        // this wont work: assigning a big value to a smaller number type.
//      smol = bigNumber;
        // casting: converting one data type into another
        smol = (byte) bigNumber;
        System.out.println(smol);
        // shorts are between byts and longs, they ussually dont use this one tho

        // float: 4 BYTES OF STORAGE SPACE
        float imafloat;
        // DOUBLE HAS 8 BYTES OF STORAGE SPACE
        double imadouble = 9.0123456789012;
        // I CANT FIT A DOUBLE INSIDE A FLOAT
//      imafloat = imadouble;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);

    }
}
