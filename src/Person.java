public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.name + "!");
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String [] args){
        //Object Basics
//        Person p1 = new Person("Bob");
//
//        System.out.println(p1.name); //Bob
//        p1.sayHello(); //Hello from Bob!
//
//        p1.setName("Robert");
//        System.out.println(p1.name); //Robert
//        p1.sayHello(); //Hello from Robert!
//
//        p1.setName("James");
//        System.out.println(p1.getName()); //James
//        p1.sayHello(); //Hello from James!
        //=================================================

        //Understanding References
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //Jane (not sure why???)
        System.out.println(person2.getName()); //Jane

    }


}
