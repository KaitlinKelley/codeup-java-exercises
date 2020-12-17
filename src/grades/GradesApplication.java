package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        boolean stillUsingApp = true;
        Input userInput = new Input();

        HashMap<String, Student> students = new HashMap<>();

//        Student.displayAllGradesEverybody(students);

        Student foster = new Student ("Foster");
        foster.addGrade(85);
        foster.addGrade(70);
        foster.addGrade(81);
        foster.addGrade(78);

        Student nimoy = new Student ("Nimoy");
        nimoy.addGrade(99);
        nimoy.addGrade(98);
        nimoy.addGrade(97);
        nimoy.addGrade(95);

        Student stanzi = new Student ("Stanzi");
        stanzi.addGrade(85);
        stanzi.addGrade(62);
        stanzi.addGrade(73);
        stanzi.addGrade(76);

        Student jonSnow = new Student ("Jon Snow");
        jonSnow.addGrade(75);
        jonSnow.addGrade(79);
        jonSnow.addGrade(87);
        jonSnow.addGrade(83);

        students.put("SnuggleMasterGeneral", foster);
        students.put("SirLordNeems", nimoy);
        students.put("Stanzi-Tron", stanzi);
        students.put("JonSnowseph", jonSnow);


        System.out.println("Welcome to the Grades Application!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        Student.displayAllUsernames(students);
        System.out.println();

        do {
            System.out.println("Which student would you like to see more information on? Type their username:");
            String userTypes = userInput.getString();
            if(!students.containsKey(userTypes)){
                System.out.println("Sorry, we do not have a student by that username");
                System.out.println("Would you like to see another student?");
                boolean yesOrNo = userInput.yesNo();
                if(!yesOrNo){
                    System.out.println("Ok. Exiting app.");
                    stillUsingApp = false;
                }
            }else if(students.containsKey(userTypes)){
                Student.findAndDisplayStudent(students, userTypes);
                System.out.println("Would you like to see another student?");
                boolean yesOrNo = userInput.yesNo();
                if(!yesOrNo){
                    System.out.println("Ok. Exiting app.");
                    stillUsingApp = false;
                }
            }







        }while(stillUsingApp);


    }






}
