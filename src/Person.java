public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName;

//        public String lastName = "Smith"; //this would give us a default last name, if not specified otherwise



    // SLIDE 4

//        // instance variables
        //Note the absence of the static keyword!
        public String firstName;
        public String lastName;
//
//        // instance method
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }


        //can put in a parameter if you want
        public String sayHello(char punctuation) {
                return lastName + ", " + firstName + " says hi!" + punctuation;
        }


    // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property
//        public String name;                                  // instance property
//
//        public static void main(String[] args) {
//
//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                Person theBestDrummerAlive = new Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                Person.worldPopulation += 1; // accessing a static property
//                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
////                 System.out.println(Person.name);
//        }

}