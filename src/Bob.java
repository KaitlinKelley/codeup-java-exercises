import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Create a class named Bob with a main method for the following exercise.
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        Scanner myInput = new Scanner(System.in);

        boolean stillTalkingToBob = true;

        do {
            System.out.println("What would you like to say to Bob?");

            String Isay = myInput.nextLine().trim();


            if (Isay.endsWith("?")) {
                System.out.println("Sure.");
                System.out.println();
            } else if (Isay.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                System.out.println();
            } else if (Isay.isEmpty()) {
                System.out.println("Fine. Be that way!");
                System.out.println();
            } else {
                System.out.println("Whatever.");
                System.out.println();
            }
            System.out.println("Would you like to say something else to Bob? [y/n]");

            String yesOrNo = myInput.nextLine();

            if (yesOrNo.equalsIgnoreCase("n")) {
                System.out.println("Ok. Byyyyeeeee....");
                stillTalkingToBob = false;
            }
        }while(stillTalkingToBob);




//nope this one doesn't work at all
//        while (true) {
//            System.out.println("What would you like to say to Bob?");
//
//            String Isay = myInput.nextLine();
//
//            if (Isay.endsWith("?")) {
//                System.out.println("Sure.");
//                System.out.println();
//            } else if (Isay.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//                System.out.println();
//            } else if (Isay.isEmpty()) {
//                System.out.println("Fine. Be that way!");
//                System.out.println();
//            } else {
//                System.out.println("Whatever.");
//                System.out.println();
//            }
//            System.out.println("Would you like to say something else to Bob? [y/n]");
//
//            String yesOrNo = myInput.next();
//
//            if (yesOrNo.equalsIgnoreCase("n")) {
//                System.out.println("Ok. Byyyyeeeee....");
//                break;
//            }
//        }
    }
}
