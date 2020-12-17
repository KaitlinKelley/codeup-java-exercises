package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
        ArrayList<Integer> grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int gradeSum = 0;
        double numOfGrades = grades.size();
        for(int grade: grades){
            gradeSum += grade;
        }
        return gradeSum/numOfGrades;
    }

    public void displayAllGradesOneStudent(){
            System.out.println("All of this student's grades are as follows:");
        for(int grade: grades){
            System.out.println(grade);
        }
    }

    public static void displayAllUsernames(HashMap<String, Student> students){
        students.forEach((key,value) -> System.out.print("|" + key + "|" + "      "));
    }

    public static void findAndDisplayStudent(Map<String, Student> students, String usernameToCheck){
        for (Map.Entry<String, Student> studentEntry : students.entrySet()) {
            String username = studentEntry.getKey();
            Student student = studentEntry.getValue();
            if(username.equals(usernameToCheck)){
                System.out.println("Name: " + student.getName());
                System.out.println("Username: " + username);
                System.out.println("Current average: " + student.getGradeAverage());
            }


        }
    }



//    public static void displayAllGradesEverybody(HashMap<String, Student> students){
//        for(String key: students.keySet()){
//            System.out.println("Username: " + key + " Grades: " + students.get(key));
//        }
//    }



}
