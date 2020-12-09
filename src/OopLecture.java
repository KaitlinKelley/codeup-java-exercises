public class OopLecture {

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
//This is an instance!
//            Person rick = new Person();
////            rick is now a variable with the type of Person (he is a Person object)
//
////        Accessing properties
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//
//            Person p2 = new Person();//instantiating an object, creating an instance
//        p2.firstName = "Rick";
//        p2.lastName = "Sanchez";
//
////            System.out.println(rick.firstName);
////            System.out.println(rick.lastName);
//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
////            System.out.println(fred.firstName);
////            System.out.println(fred.lastName);
//
////        System.out.println(rick); //Would give us the reference id, tells us where it exists in memory
////
////        System.out.println(p2); //gives us a difference reference id to rick, even though it has identical properties!
////
////        System.out.println(rick == p2); //false; it's ok to use == in this case. We're asking "is this the exact same object?"
//
//        Person rickImposter = p2;
//
////        System.out.println(rickImposter); //rickImposter is now a different name for p2, two different ways to refer to the same thing
//
//        Person p3 = new Person();
//        p3.lastName = "Jones";
//
////        System.out.println(p3.lastName);
////        System.out.println(p3.firstName); //null, because we didn't define it (For any reference type, if we don't define it, the default value is null)



        // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());//invoking the method
//            System.out.println(rick.sayHello('!'));//invoking the method with parameter
        //Remember overloading!

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");


        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --

//        Dog dog = new Dog();
//        dog.name = "Sparky";
//        dog.age = 3;
//        dog.callForDog("Sparky");//Sparky is now walking toward you!
//        dog.callForDog(dog.name);//Sparky is now walking toward you!
//        dog.callForDog("Rover");//Sparky ignores you.
//
//        System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);
//
//        //Sparky's Age in Dog Years
//        System.out.println(DogHelper.humanToDogYears(dog.age));


        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            Student kaitlin = new Student("Kaitlin Muse", "Jupiter");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"
//
//            System.out.print(kaitlin.name + " - ");
//            System.out.println(kaitlin.cohort);

//            Student s1 = new Student();
//            Student s2 = new Student();
//
//            s1.testMethod();
//            s2.testMethod();


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)
//
//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name); // "John Doe"
//            student.name = "Robert Smith";
//            System.out.println(student.name);

            // DON'T DO THIS - can't access private properties outside the class
        //Won't even compile!
//            System.out.println(student.grade);

//            System.out.println(student.shareGrade()); // Do this instead

        //In this situation, the grade canNOT be changed from the OopLecture class




//        student.changeGrade(70);
//        System.out.println(student.shareGrade());


    }

}