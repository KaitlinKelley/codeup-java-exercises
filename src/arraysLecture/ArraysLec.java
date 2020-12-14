package arraysLecture;

import java.util.Arrays;

public class ArraysLec {

    public static void main(String[] args) {

        /* ******************************************************** */
        /* ********** USING PRIMITIVE AND REFERENCE TYPES  **********/
        /* ******************************************************** */

        // https://stackoverflow.com/questions/29140402/how-do-i-print-my-java-object-without-getting-sometype2f92e0f4



        // Int Example
        //Declare an int array variable and assign an int array with the length of 3 to the array variable nums

//        int[] nums = new int[3];
//
//        nums[0] = 1; //Assign each index to an int variable
//        nums[1] = 10;
//        nums [2] = 12;
//
//        System.out.println(nums); //Type@HashcodeOfObject, prints out [I@2c8d66b2
//
//        System.out.println(Arrays.toString(nums)); //this is an Array method

//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }

//        for(int num: nums){  //same as the above for loop, just using the enhanced for loop
//            System.out.println(num);
//        }

        // Dog Example
//        Dog d1 = new Dog("Bean", 1);
//        Dog d2 = new Dog("Patch", 3);
//        Dog d3 = new Dog("Rolo", 5);
//
//
//        //Declaring a Dog array variable called dogs and creating a new Dog array with a length of 4
//        Dog[] dogs = new Dog[4];
//        dogs[0] = d1;
//        dogs[1] = d2;
//        dogs[2] = d3;



//        System.out.println(dogs);

        /*
         * !!!!! NOTE !!!!!
         * System.out.println(dogs);
         *
         * When we print "dogs" you will get some version of this!
         * [LarraysLecture.Dog;@___________
         *
         * [ = single dimension
         * L = array contains a class or interface
         * arraysLecture.Dog = type of object (arraysLecture b/c in arraysLecture package)
         */


//        System.out.println(Arrays.toString(dogs)); //prints out more hash code stuff
//
//        for (int i = 0; i < dogs.length; i += 1) {
//            System.out.println(dogs[i].getName());
//        }

        //The above loop gives us:
        //Exception in thread "main" java.lang.NullPointerException
        //	at arraysLecture.ArraysLec.main(ArraysLec.java:70)
        //Because last value of this array is currently null








        /* ******************************************************** */
        /* ********** Array Initializer & Iterating  ************** */
        /* ******************************************************** */
//        String[] languages = new String[4];
//        languages[0] = "html";
//        languages[1] = "css";
//        languages[2] = "javascript";
//        languages[3] = "java";
//
//        System.out.println(Arrays.toString(languages));
//
//
//
////Using shorthand syntax here
//        String[] languages2 = {"html2", "css2", "javascript2", "java2"};
//        System.out.println(Arrays.toString(languages2));
//
//
//
////        //enhanced for loop
//        for (String language : languages2) {
//            System.out.println(language);
//        }







        /* ******************************************************** */
        /* ************ Array Methods Mini Activity  ************** */
        /* ******************************************************** */
        //TODO: Experiment with the following Array methods. Add a few comments explaining what is happening. Bonus: Create your own example.


        // Example1:  Array.fill()

//        String[] testArray = new String[4];  //creates an array to hold 4 Strings
//
//        System.out.println(Arrays.toString(testArray)); //[null, null, null, null], nothing assigned to the array yet
//
//        Arrays.fill(testArray, "dogs"); //assigns the string "dogs" to each index in the array
//
//        for (String element : testArray) {
//            System.out.println(element);
//        }
        //Gives us:
        //dogs
        //dogs
        //dogs
        //dogs

        //===============================================================


        // ***Example1: BONUS ***
//        int[] numArray = {1,1,1,1,1,1,1,1,1,1};
//
//        Arrays.fill(numArray, 0, 4, 5);
//        for (int element : numArray) {
//            System.out.println(element);
//        }
        //Gives us:
//        5
//        5
//        5
//        5
//        5
//        1
//        1
//        1
//        1
//        1

//=============================================================================



        // Example 2: Arrays.equals(array1, array2)
        // Returns true if two array elements are equal and in the same order

//        String[] words = {"Mushroom", "Mushroom"};
//        String[] words2 = {"Mushroom", "mushroom"};
//        String[] words3 = {"Mushroom", "mushroom"};
//        System.out.println(Arrays.equals(words, words2)); //false
//        System.out.println(Arrays.equals(words2, words3)); //true


//=======================================================================


        // Example 3: Arrays.copyOf()
        // Returns a copy array of a given array of a given length
        //Can have a third parameter of "class" ???

//        String[] badgerArray = new String[4];
//        Arrays.fill(badgerArray, "Badgers"); //fills the above array with "Badgers" at each index
//
//        String[] twoBadgers = Arrays.copyOf(badgerArray, 2); //copy of badgerArray, with only 2 indices, starting at 0
//        System.out.println(Arrays.toString(twoBadgers)); //[Badgers, Badgers]
//
//        String[] allTheBadgers = Arrays.copyOf(badgerArray, 7);
//        System.out.println(Arrays.toString(allTheBadgers)); //[Badgers, Badgers, Badgers, Badgers, null, null, null]
//


//=======================================================================



        // Example 4: Arrays.sort(array, startIndex, toIndex)
        // Sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

//        String[] animals = {"Dog", "Rabbit", "Cat", "Snake", "Fish"};
//        System.out.println(Arrays.toString(animals)); //[Dog, Rabbit, Cat, Snake, Fish]
//
//        Arrays.sort(animals);
//        System.out.println(Arrays.toString(animals)); //[Cat, Dog, Fish, Rabbit, Snake] (animals sorted in alphabetical order!)
//
//        System.out.println("===========================");
//        String[] animals2 = {"Marmot", "Kinkajou", "Pangolin", "Fruit Bat", "Cougar", "Iguana"};
//        System.out.println(Arrays.toString(animals2));
//        Arrays.sort(animals2);
//        System.out.println(Arrays.toString(animals2));
//
//        System.out.println(Arrays.equals(animals, animals2)); //false
//
//        String[] justFrogs = new String[6];
//        Arrays.fill(justFrogs, "Frog");
//
//        Arrays.fill(animals2, "Frog");
//        System.out.println(Arrays.toString(animals2));
//        System.out.println(Arrays.equals(animals2, justFrogs)); //true
//        System.out.println("We're all just frogs now.");
//        System.out.println("============================");
//        Arrays.fill(animals2, "MARMOT");
//        System.out.println(Arrays.toString(animals2));
//        System.out.println("MARMOTS. MARMOTS EVERYWHERE. RUN");








        /* ******************************************************** */
        /* ************** Two-Dimensional Arrays  ***************** */
        /* ******************************************************** */


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//
//      These rows and elements are also 0-indexed

//
//        // access the first element in the second row
        //Row Index 1, Element Index 0
        System.out.println(matrix[1][0]); // 4
//
//
//        // the last element in the first row
        System.out.println(matrix[0][2]); // 3
//
//
//        // the first element in the last row
        System.out.println(matrix[2][0]); // 7




        /* ******************************************************** */
        /* ************** Arrays vs. Array Lists  ***************** */
        /* ******************************************************** */

        //https://stackoverflow.com/questions/4842883/are-there-reasons-to-prefer-arrays-over-arraylists

        //Remember that Arrays in Java are a less flexible data type than Arrays in JavaScript. This is why our Array methods are limited.

        //ArrayLists in Java which we will experience later are more similar to Arrays we saw in JavaScript and allows for different functionality.



    }
}