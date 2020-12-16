import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1,2,3));//initializing array list with values already in it

        System.out.println(randomNumbers);

        // Add elements to an ArrayList. The element type is the determined by the Object type within the angle brackets <>
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(13);
        // the .add() method doesn't return anything, just appends to the array list

        numbers.remove(Integer.valueOf(13)); //Will remove the first 13 it comes across
        //forces java to read 13 as an integer value, instead of an index

        // prints out ArrayList
        System.out.println(numbers);

        // return length of the ArrayList with .size()
        System.out.println(numbers.size());

        // return an element at the specified index
        System.out.println(numbers.get(1));
//        System.out.println(numbers.get(5));//throws an out of bounds exception

        // returns index position of found element, -1 if not found.
        System.out.println(numbers.indexOf(13)); //returns the first found index of 13
        System.out.println(numbers.indexOf(20)); // returns -1

        // TODO: Add a new Integer to the numbers ArrayList at index 1.

        numbers.add(1, 11);  //numbers.add(index, element)
//        numbers.add("fortyfive"); //incompatible types, won't compile...will hold Integers only
        System.out.println(numbers);

        ArrayList<String> roasts = new ArrayList<>();
        ArrayList<String> emptyList = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("dark");
        roasts.add("medium");

        System.out.println(roasts);

        // .contains returns a boolean value based on whether or not a searched value exists in the ArrayList
        System.out.println(roasts.contains("dark")); //true
        // TODO: Check if the roasts list contains "espresso"
        System.out.println(roasts.contains("espresso")); //false

        // returns the last occurrence of a given value
        // TODO: Find the last "medium" roast in the list.
        System.out.println(roasts.lastIndexOf("medium")); //6

        // TODO: How could we check if the roasts list is empty?
        System.out.println(roasts.isEmpty()); //false
        System.out.println(emptyList.isEmpty()); //true

        // TODO: Remove one medium roast from the list. If there are duplicate strings in the list, which one is removed first?
        //Will remove the first element it finds that matches the criteria
        //Returns a boolean value when used this way
        System.out.println(roasts.remove("medium")); //true

        System.out.println(roasts.remove("espresso")); //false


        // TODO: Remove the element at index 4. Note the return value here vs. the previous remove method.

        System.out.println(roasts.remove(4)); //returns "dark", the element that was removed

        // BONUS TODO: How can we get the list of roasts in alphabetical order?

        Collections.sort(roasts);
        System.out.println(roasts);

    }
}
