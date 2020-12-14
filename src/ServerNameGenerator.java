public class ServerNameGenerator {

    static String[] adjectives = {"lovely", "spirited", "negative", "optimistic", "judgemental", "interested", "strange", "thoughtful", "crippled", "useless"};

    static String[] nouns = {"shoe", "bookshelf", "George", "Albuquerque", "Whataburger", "field mouse", "saxophone", "slide", "platypus", "shovel"};

    public static String getRandomString(String[] array){
        int randomInt = (int) Math.floor(Math.random() * 9);
        return array[randomInt];
    }

    public static void main(String[] args){
        String adj = getRandomString(adjectives);
        String noun = getRandomString(nouns);
        System.out.println("Here is your server name:");
        System.out.println(adj + "-" + noun);
    }










}

