package OOP_skole.module1.assignments;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){ //Main metoden
        Scanner input = new Scanner(System.in);
        String besked = input.nextLine();

        for (int i = 0; i < 10; i++){
            System.out.println(besked);
        }
    }
}
/*Write a small program that takes a text line as input and prints
 this ten times to the consol. */