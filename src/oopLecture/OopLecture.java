package oopLecture;

public class OopLecture {

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
//This is an instance!
//            oopLecture.Person rick = new oopLecture.Person();
////            rick is now a variable with the type of oopLecture.Person (he is a oopLecture.Person object)
//
////        Accessing properties
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//
//            oopLecture.Person p2 = new oopLecture.Person();//instantiating an object, creating an instance
//        p2.firstName = "Rick";
//        p2.lastName = "Sanchez";
//
////            System.out.println(rick.firstName);
////            System.out.println(rick.lastName);
//
//            oopLecture.Person fred = new oopLecture.Person();
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
//        oopLecture.Person rickImposter = p2;
//
////        System.out.println(rickImposter); //rickImposter is now a different name for p2, two different ways to refer to the same thing
//
//        oopLecture.Person p3 = new oopLecture.Person();
//        p3.lastName = "Jones";
//
////        System.out.println(p3.lastName);
////        System.out.println(p3.firstName); //null, because we didn't define it (For any reference type, if we don't define it, the default value is null)



        // -- oopLecture.Dog Example --


//            oopLecture.Dog d1 = new oopLecture.Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            oopLecture.Person rick = new oopLecture.Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());//invoking the method
//            System.out.println(rick.sayHello('!'));//invoking the method with parameter
        //Remember overloading!

        // -- oopLecture.Dog Method Example --

//            oopLecture.Dog d1 = new oopLecture.Dog();
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

        // -- oopLecture.DogHelper Example --

//        oopLecture.Dog dog = new oopLecture.Dog();
//        dog.name = "Sparky";
//        dog.age = 3;
//        dog.callForDog("Sparky");//Sparky is now walking toward you!
//        dog.callForDog(dog.name);//Sparky is now walking toward you!
//        dog.callForDog("Rover");//Sparky ignores you.
//
//        System.out.println(oopLecture.DogHelper.NUMBER_OF_DOG_BREEDS);
//
//        //Sparky's Age in oopLecture.Dog Years
//        System.out.println(oopLecture.DogHelper.humanToDogYears(dog.age));


        // ======================== slide 7 (class vs. object fields)

//            oopLecture.Person theBestDrummerAlive = new oopLecture.Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            oopLecture.Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(oopLecture.Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            oopLecture.Student jane = new oopLecture.Student("Jane Doe", "Zion");
//            oopLecture.Student kaitlin = new oopLecture.Student("Kaitlin Muse", "Jupiter");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            oopLecture.Student john = new oopLecture.Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"
//
//            System.out.print(kaitlin.name + " - ");
//            System.out.println(kaitlin.cohort);

//            oopLecture.Student s1 = new oopLecture.Student();
//            oopLecture.Student s2 = new oopLecture.Student();
//
//            s1.testMethod();
//            s2.testMethod();


        // ======================== slide 9 (this keyword)

//            oopLecture.Student jane = new oopLecture.Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            oopLecture.Student john = new oopLecture.Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)
//
//            oopLecture.Student student = new oopLecture.Student("John Doe", 82.4);
//            System.out.println(student.name); // "John Doe"
//            student.name = "Robert Smith";
//            System.out.println(student.name);

            // DON'T DO THIS - can't access private properties outside the class
        //Won't even compile!
//            System.out.println(student.grade);

//            System.out.println(student.shareGrade()); // Do this instead

        //In this situation, the grade canNOT be changed from the oopLecture.OopLecture class




//        student.changeGrade(70);
//        System.out.println(student.shareGrade());


    }

}