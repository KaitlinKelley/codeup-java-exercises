import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23,46,32,10,6));

        for(int num:nums){
            System.out.println(num);
        }

        HashMap<Character, String> answers = new HashMap<>();

        answers.put('A', "Sally");
        answers.put('B', "Sally");
        answers.put('C', "Jimbo");
        answers.put('D', "Jimbo");
        answers.put('E', "Jim");

        System.out.println(answers.get('C')); //"Jimbo"

        System.out.println(answers.keySet()); //returns all the keys from the hashmap
        Set<Character> keys = answers.keySet(); //storing all the keys in a set

        //How can we find all of Jimbo's answers?

        for(char key:keys){
            if (answers.get(key).equals("Jimbo")){ //.get returns the value of the key that it "gets"
                System.out.println(key);
            }
        }


    }







}
