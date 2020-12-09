package oopLecture;

public class Student {

    // ======================== slide 8 (constructors)

//        public String name;
//        public String cohort;
//
//        public void testMethod(){
//            System.out.println("Will this run?");
//        }
//
//        public oopLecture.Student(){
//            System.out.println("New oopLecture.Student created. Please add info.");
//            testMethod();
//        }
//
//        public oopLecture.Student(String studentName) {
//            this(); //Calls the oopLecture.Student() method, and then therefore the testMethod()
//            name = studentName;
//            cohort = "Unassigned";
//        }
//
//        public oopLecture.Student(String studentName, String assignedCohort) {
//            name = studentName;
//            cohort = assignedCohort;
//        }


    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public oopLecture.Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public oopLecture.Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }
//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }


    // ======================== slide 10 (visibility)

        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        //getter method
        public double shareGrade() {
            return grade;
        }

        //setter method
        public void changeGrade(double grade){
            this.grade = grade;   //whatever is passed in is now the new value for grade
        }

        //getter
        public String getName(){
            return name;
        }

        //setter
        public void setName(String name){
            this.name = name;
        }
//
}