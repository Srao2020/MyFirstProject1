import java.util.Scanner;
/**
 * This is a simple ask-a-question class. Nothing other than the main.
 * @author Srao2020
 * @version 09.13.2022
 */
public class WhatIsYourFavorite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite movie?");
        String movie = in.nextLine();
        System.out.println(movie + " is terrible! I hate that!");
        System.out.println("jk! I love " + movie + " too" );
    }
}
