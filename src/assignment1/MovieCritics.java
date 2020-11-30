/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class MovieCritics {
    public static void main(String[] args) {
        System.out.println("Welcome to Cinema Critics!");
        System.out.println("Please enter the number of movies.");
        //3shn lzm a3ref 3adad el movies abl ma elo a3tene asme2on.
        Scanner inFromKeyboard = new Scanner(System.in);// a5dnaha mn el user
        final int nbMovies = inFromKeyboard.nextInt();// ele bdo y7uto el user bl int ele jeye 7utu b variable nbMovies
        inFromKeyboard.nextLine();// read the new line symbol after the integer from the keyboard buffer
        String[] movieNames = new String[nbMovies];
         for (int i = 0; i < nbMovies; i++) {
            System.out.println("Please enter the name of the movie number"+ (i+1) + ":");
            movieNames[i]=inFromKeyboard.nextLine();
             System.out.println("========================================");
             
        }
    }
    
}
