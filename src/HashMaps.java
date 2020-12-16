import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // We'll start by defining a hash map
        //HashMaps are not index-based like Collections
        //All keys in a hashmap must be the same type, and all values must be the same type
        //Each key must be unique
        //Useful for storing usernames and passwords, as a real-world example
        HashMap<String, String> usernames = new HashMap<>();
        HashMap<Character, String> answers = new HashMap<>();

        // and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        answers.put('a', "true");
        answers.put('b', "vivian");
        answers.put('c', "sophie");

        System.out.println(usernames);
        // TODO: Add more key-value pairs to usernames
        //Cannot specify where these key-value pairs are added
        //They are added randomly
        usernames.put("Kaitlin", "kaitlinkelley");
        usernames.put("John", "jcoker");
        System.out.println(usernames);

        // obtaining values from the hash map by key
        // TODO: Get the value stored in key "Ryan"
        System.out.println(usernames.get("Ryan"));

        // TODO: Get the value stored in key "Phillip". What is the result?
        System.out.println(usernames.get("Phillip")); //null, does not exist in this hashmap

        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

        // checking if keys or values are present
        // TODO: Check if key "Justin" exists in the HashMap
        System.out.println(usernames.containsKey("justin")); //false, because of case-sensitivity

        // TODO: Check if the value "fmendozaro"
        System.out.println(usernames.containsValue("fmendozaro")); //true

        usernames.put("Ryan", "ryanorsinger"); //will override the existing matching key-value pair

        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde"); //onlu adds the key-value pair if it doesn't already exist in the hashmap
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        // TODO: Remove key "Zach" and the value associated with it
        usernames.remove("Zach");
        System.out.println(usernames); // {Ryan=ryanorsinger}

        // TODO: Replace Ryan's username with "torvalds"
        usernames.replace("Ryan", "torvalds");
        System.out.println(usernames); // {Ryan=torvalds}

        usernames.clear();
        System.out.println(usernames.isEmpty()); //true, hashmap is now empty
    }
}