package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args){

        Input userInput = new Input();

        boolean stillUsingApp = true;

        System.out.println("Welcome to the Codeup Movie App!");

        do{
            displayChoices();
            int userChoice = userInput.getInt();

            if(userChoice == 0){
                System.out.println("Ok! Exiting program.");
                stillUsingApp = false;
            }else{
                if(userChoice == 1){
                    System.out.println("Here are ALL the films:");
                    System.out.println("-----------------------");
                    showAllMovies();
                }else if(userChoice == 2){
                    System.out.println("Here are all the films in the Animated Category:");
                    System.out.println("-----------------------");
                    showAllAnimated();
                }else if(userChoice == 3){
                    System.out.println("Here are all the films in the Drama Category:");
                    System.out.println("-----------------------");
                    showAllDrama();
                }else if(userChoice == 4){
                    System.out.println("Here are all the films in the Horror Category:");
                    System.out.println("-----------------------");
                    showAllHorror();
                }else if(userChoice == 5){
                    System.out.println("Here are all the films in the Sci-Fi Category:");
                    System.out.println("------------------------");
                    showAllSciFi();
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








}
