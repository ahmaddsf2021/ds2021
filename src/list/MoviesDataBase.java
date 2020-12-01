/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class MoviesDataBase {
       private static final int BUFFER_SIZE = 2;
        int effectiveNbMovies = 0;
        Movie[] moviesList = new Movie[BUFFER_SIZE];

    public void add(Movie movie) {
     if (moviesList.length == effectiveNbMovies) {
            
            Movie[] newMoviesList = new Movie[moviesList.length + BUFFER_SIZE];
            
            for (int i = 0; i < moviesList.length; i++) {
                newMoviesList[i] = moviesList[i];
            }
            moviesList = newMoviesList;
          }
        moviesList[effectiveNbMovies] = movie;
        effectiveNbMovies++;
    }

   
    }
    
}
