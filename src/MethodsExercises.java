public class MethodsExercises {

    public static void main(String[] args){
        addStuff(14,32);
        subtractStuff(14,32);
        multiplyStuff(14,32);
        divideStuff(14,32);
        findRemainder(32,14);
        divideStuff(5,0); //Gives us infinity??????? Dunno why.
        //Dividing by infinity in Java can throw an exception, or result in infinity, depending on whether we are using an int or a float, etc.
        multiplyWithLoop(5,3);
        multiplyWithLoop(7,8);

    }

    public static void addStuff(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtractStuff(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void multiplyStuff(int num1, int num2){
        System.out.println(num1*num2);
    }

    public static void divideStuff(float num1, float num2){
        System.out.println(num1/num2);
    }

    public static void findRemainder(int num1, int num2){
        System.out.println(num1 % num2);
    }

    public static void multiplyWithLoop(int baseNum, int numOfTimes){
        int result = 0;
        for(int i = 1; i <= numOfTimes; i++){
            result += baseNum;
        }
        System.out.println(baseNum + "x" + numOfTimes + " = " + result);
    }


}
