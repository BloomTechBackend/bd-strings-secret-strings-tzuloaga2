package strings;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String beginning = " your ";
        String middle = "gently down the ";
        String end = "life is but a";

        Scanner scanner = new Scanner(System.in);
        //StandardCharsets.UTF_8 not working

        System.out.println("Enter a verb: ");
        String verb1 = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter another noun: ");
        String noun2 = scanner.nextLine();


        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("Enter one last noun: ");
        String noun3 = scanner.nextLine();

        //**Use the addition operator + to complete the beginning stanza
        //Use the String.concat() method to complete the middle stanza
        //Use String.format() to complete the end stanza.



        System.out.println("Your Song: ");
        beginning = verb1 + ", " + verb1 + ", " + verb1 + beginning + noun1;
        System.out.println(beginning);

        middle = middle.concat(noun2);
        System.out.println(middle);

        end = String.format("%1$s, %1$s, %1$s, %1$s, %2$s %3$s!", adverb, end, noun3);
        System.out.println(end);

       //System.out.println(beginning + middle + end);
    }
}
