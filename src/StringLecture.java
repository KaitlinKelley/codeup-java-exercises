public class StringLecture {

    public static void main(String[] args) {
//        Important String lesson concepts:
//  Strings are NOT a primitive type. They are a reference type. Reference types are objects.
//  Strings are immutable in Java; string manipulations will not alter original.
//  String values should NOT be compared using ‘==’.

// ------ .equals(String anotherString) used to compare the value of two Strings

//        String one = "2";
//        String two = "2";
//        System.out.println(one.equals(two)); //true
//        System.out.println(two.equals(one)); //true
//
//        System.out.println("bob".equals("steve")); //false
//
//        System.out.println(one == two); //this is NOT comparing the values of the strings!! Don't do it. Just don't.




// ------ .equalsIgnoreCase(String anotherString)

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HoWDy")); //true


// ------ .startsWith(String prefix)

//        String title = "Dr. Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor); //true


// ------ .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup); //true


// ------ .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//
//        System.out.println(firstLetterCapitalized);


// ------ .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));


// ------ .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));


// ------ .length()

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


// ------ .replace(char oldChar, char newChar)

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch);


// ------ .substring(int beginIndex[, int endIndex])

//        String name = "Justin Bob Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//
//        String lastName = name.substring(name.lastIndexOf(" ") + 1); //finds the last whitespace, moves one index over, then goes to the end of the string
//        System.out.println(firstName);
//        System.out.println(lastName);

        String name = "Justin Reich";
        String firstName = name.substring(0, name.indexOf(" "));
        System.out.println(firstName);
        String lastName = name.substring(firstName.length() + 1);
        System.out.println(lastName);


// ------ .toLowerCase() and .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


// ------ .trim()  Will take out leading and trailing whitespace

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);
//
//        System.out.print("|" + input + "|");


// ------ chaining string methods

// convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//        String word1 = "animalBonus.Cat ";
//        String pigLatinWord = word1
//            .trim()  //"animalBonus.Cat"
//            .toLowerCase() //"cat"
//            .substring(1) //"at"
//            .concat(word1.substring(0, 1).toLowerCase()) // "atc"
//            .concat("ay"); //"atcay"
//        System.out.println(pigLatinWord); //"atcay"



    }

}