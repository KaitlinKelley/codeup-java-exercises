import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args){
        Person[] personArray = new Person[3];

        personArray[0] = new Person("Bob");
        personArray[1] = new Person("Joe");
        personArray[2] = new Person("Steve");

//        for(Person person: personArray){
//            System.out.println(person.getName());
//        }

        Person[] personArray3 = addPerson(personArray, new Person("Ted"));

        for(Person person : personArray3){
            System.out.println(person.getName());
        }

    }


    public static Person[] addPerson(Person[] arrayOfPersons, Person personToAdd){
        Person[] personArray2 = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        personArray2[arrayOfPersons.length] = personToAdd;
        return personArray2;
    }





}
