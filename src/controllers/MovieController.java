package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        for(int i=0; i<movies.length; i++){
            int indiceMenor = i;
            for(int j=i+1; j<movies.length; j++){
                if((movies[j].getTitle().compareTo(movies[indiceMenor].getTitle()))<0){
                    indiceMenor=j;
                }
            }
            if(i!=indiceMenor){
                Movie aux = movies[i];
                movies[i]=movies[indiceMenor];
                movies[indiceMenor]=aux;
            }
        }

    }

}
