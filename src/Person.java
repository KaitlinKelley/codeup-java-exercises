public class Person {

    private String name;

    public Person(String name){
        this.name = name;
        //or setName(name)
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.name + "!");
    }


    public static void main(String [] args){
        //Object Basics
//        Person p1 = new Person("Bob");
//
//        System.out.println(p1.name); //Bob
//        p1.sayHello(); //Hello from Bob!

//        p1.setName("Robert");
//        System.out.println(p1.name); //Robert
//        p1.sayHello(); //Hello from Robert!
//
//        p1.setName("Bobert");
//        System.out.println(p1.getName()); //Bobert
//        p1.sayHello(); //Hello from Bobert!
        //=================================================

        //Understanding References
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true, comparing two strings
//        System.out.println(person1 == person2); //false, trying to see if they're the same object (they're not)


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true, person2 is now just another way to refer to person1

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //Jane, person1 and person2 are still referring to the same person object
        System.out.println(person2.getName()); //Jane

    }


}
