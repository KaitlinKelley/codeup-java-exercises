package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String movieName, String movieCategory){
        name = movieName;
        category = movieCategory;
    }

    public String getName(){
        return name;
    }

    public void setName(String movieName){
        name = movieName;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String movieCategory){
        category = movieCategory;
    }












}
