import java.util.Arrays;
import java.util.Comparator;


class Movies {

    public  String title;
    public String director;
    public  int rating;

    Movies(int r){
        title="civil war";
        director="Antony Russov";
        rating=r;


    }

    Movies(){
        title="Wakanda Forever";
        director="Ryan Coogler";
        rating=3;
    }

    Movies(String title,String director,int rating){
        this.rating=rating;
        this.title=title;
        this.director=director;
    }



    public static void getRating(Movies[] Movie){
        for (Movies movie : Movie) {
            if (movie.rating > 3) {
                System.out.println(movie.title);
            }
        }

    }


    public static void display_title(Movies[] Movie){
        for(Movies movie:Movie)
            System.out.println(movie.title);
    }

    public static void display_director(Movies[] Movie){
        for (Movies movie:Movie)
            System.out.println(movie.director);
    }

    public static Movies[] movieUppercase(Movies[] Movie){
        for(Movies movie:Movie)
            movie.title=movie.title.toUpperCase();

        return Movie;
    }

    public  static Movies[] sortnames(Movies[] Movie){
        Arrays.sort(Movie, Comparator.comparing(o -> o.director));
        return Movie;
    };


    public static void main(String[] args){

        Movies.display_title(movieUppercase(new Movies[]{new Movies(4)}));
        System.out.println();
        Movies.display_director(sortnames(new Movies[]{new Movies(4),new Movies()}));
        System.out.println();
        Movies.getRating(new Movies[]{new Movies(4),new Movies(),new Movies("Avengers","Joe russo",5)});








    }
}
