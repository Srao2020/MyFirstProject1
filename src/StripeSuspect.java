import java.util.Scanner;
/**
 * This is a simple ask-a-question class. Nothing other than the main.
 * @author Srao2020
 * @version 09.13.2022
 */
public class StripeSuspect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.println("Hi" + name);
        Scanner nj = new Scanner(System.in);
        System.out.println("How are you doing" + name + "?");
        String feels = nj.nextLine();
        System.out.println(feels + "? That's good.");
        System.out.println("You know what" + name + "?");
        System.out.println("You're a Stripe Suspect");
    }
}
