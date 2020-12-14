package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args){

        Input userInput = new Input();

        boolean stillUsingApp = true;

        System.out.println("Welcome to the Codeup Movie App!");

        do{
            displayChoices();
            int userChoice = userInput.getInt();
//            boolean yesOrNo = userInput.yesNo();
//            Movie[] movieArray = MoviesArray.findAll();

            if(userChoice == 0){
                System.out.println("Ok! Exiting program.");
                stillUsingApp = false;
            }else{
                if(userChoice == 1){
                    System.out.println("Here are ALL the films:");
                    System.out.println("-----------------------");
                    showAllMovies();
//                    getConfirmation(userInput);
                }else if(userChoice == 2){
                    System.out.println("Here are all the films in the Animated Category:");
                    System.out.println("-----------------------");
                    showAllAnimated();
//                    getConfirmation(userInput);
                }else if(userChoice == 3){
                    System.out.println("Here are all the films in the Drama Category:");
                    System.out.println("-----------------------");
                    showAllDrama();
//                    getConfirmation(userInput);
                }else if(userChoice == 4){
                    System.out.println("Here are all the films in the Horror Category:");
                    System.out.println("-----------------------");
                    showAllHorror();
//                    getConfirmation(userInput);
                }else if(userChoice == 5){
                    System.out.println("Here are all the films in the Sci-Fi Category:");
                    System.out.println("------------------------");
                    showAllSciFi();
//                    getConfirmation(userInput);
                }else if(userChoice == 6){
                    Movie[] movieArray = MoviesArray.findAll();
                    System.out.println("Please enter a movie title:");
                    String userTitle = userInput.getString();
                    System.out.println("Please enter a category:");
                    String userCategory = userInput.getString().toLowerCase().trim();
                    Movie movieToAdd = new Movie(userTitle, userCategory);
                    Movie[] updatedArray = addMovie(movieArray, movieToAdd);

                }

            }


        }while(stillUsingApp);


    }







    public static void displayChoices(){
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - add a movie");
        System.out.println();
        System.out.println("Please enter your choice:");
    }

    public static void showAllMovies(){
        Movie[] movieArray = MoviesArray.findAll();
        for(Movie movie: movieArray){
            System.out.println(movie.getName() + "--" + movie.getCategory());
        }
        System.out.println("---------------");
        System.out.println();
    }

    public static void showAllAnimated(){
        Movie[] movieArray = MoviesArray.findAll();
        for(Movie movie: movieArray){
            if(movie.getCategory().equals("animated")){
                System.out.println(movie.getName());
            }
        }
        System.out.println("---------------");
        System.out.println();
    }

    public static void showAllDrama(){
        Movie[] movieArray = MoviesArray.findAll();
        for(Movie movie: movieArray){
            if(movie.getCategory().equals("drama")){
                System.out.println(movie.getName());
            }
        }
        System.out.println("---------------");
        System.out.println();
    }

    public static void showAllHorror(){
        Movie[] movieArray = MoviesArray.findAll();
        for(Movie movie: movieArray){
            if(movie.getCategory().equals("horror")){
                System.out.println(movie.getName());
            }
        }
        System.out.println("---------------");
        System.out.println();
    }

    public static void showAllSciFi(){
        Movie[] movieArray = MoviesArray.findAll();
        for(Movie movie: movieArray){
            if(movie.getCategory().equals("scifi")){
                System.out.println(movie.getName());
            }
        }
        System.out.println("---------------");
        System.out.println();
    }

//    public static void getConfirmation(Input userInput){
//        boolean stillUsingApp;
//        System.out.println("Would you like to continue? [y/n]");
//        boolean yesOrNo = userInput.yesNo();
//        if(!yesOrNo){
//            stillUsingApp = false;
//        }
//    }

    public static Movie[] addMovie(Movie[] array, Movie movie){
        Movie[] updatedMovieArray = Arrays.copyOf(array, array.length + 1);
        updatedMovieArray[array.length] = movie;
        return updatedMovieArray;
    }












}
