package OOP_skole.module1.assignments;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input en string: ");
        String besked = input.nextLine();
        switch (besked) {
            case "fun":
                System.out.println("Har du det sjovt?!?");
                break;
            case "boring":
                System.out.println("Du skal have det sjovt!");
                break;
            default:
                System.out.println("Du er satme kedelig");
        }
    }
}

/*Implement a program that takes a word (string) as input and then reacts
on keywords like for instance “myWord” and writes something else in its
place. Define ten words and make the code react to those words (hint:
switch). */