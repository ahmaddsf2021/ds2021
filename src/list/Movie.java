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
public class Movie {
    private String name;
    private int releaseYear; 

    public Movie(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;}

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", releaseYear=" + releaseYear + '}';
    }
    
    
    
}
