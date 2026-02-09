package OOP_skole.module1.assignments;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en int: ");
        int number = input.nextInt();

        int i = 0;
        while(i < number){
            System.out.println("I love dih");
            i++;
        }
        input.close();
        
    }
}
/*Write a small program that takes and integer, x, 
as input and prints a text
string of you own choice to the console x Kmes */