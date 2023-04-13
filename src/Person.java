public class Person {
    public static void main(String[] args) {
        Person person9 = new Person("Dawson");
        person9.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


    // ----constructor---
    private String name;

    public Person(String name) {
        this.name = name;
    }
    // ------------------

    // ----- getter -----
    public String getName(){
        return name;
    }
    // ------------------


    // ----- setter -----
    public void setName(String name) {
        this.name = name;
    }
    // ------------------


    public void sayHello(){
        System.out.println("Hello " + name);
    }


}
