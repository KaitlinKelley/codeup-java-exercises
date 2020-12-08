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
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }


        //can put in a parameter if you want
//        public String sayHello(char punctuation) {
//                return lastName + ", " + firstName + " says hi!" + punctuation;
//        }


    // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property, not a constant, so can be changed
        public String name;                                  // instance property

        public void sayName(){
                if (name.length() > 5){
                        System.out.println("My long name is: " + name);
                }else {
                System.out.println("My name is: " + name);

                }
        }

        public static String findLongestName(Person p1, Person p2){
                if (p1.name.length() > p2.name.length()){
                        return p1.name;
                } else {
                        return p2.name;
                }
        }

        public static void main(String[] args) {

//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
                Person theBestDrummerAlive = new Person();//instantiate a new person object
                theBestDrummerAlive.name = "Neil Peart";//assign value to name property
                Person.worldPopulation += 1; // accessing a static property

                theBestDrummerAlive.sayName();

                Person notADrummer = new Person();
                notADrummer.name = "Justin";

                String longestName = Person.findLongestName(theBestDrummerAlive, notADrummer);
                System.out.println(longestName);


//                // this also works, but is usually not a good idea:
                //accessing static methods and variables through object instead of through the class
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001

//                // DONT DO THIS, it will not compile
                //trying to access an instance variable method in a static way
////                 System.out.println(Person.name);  //name is an instance variable
        }

}