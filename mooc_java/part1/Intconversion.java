import java.util.Scanner;

public class Intconversion {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int value = Integer.valueOf(input.nextLine());
        System.out.println("You gave the number " + value);
    }
}
/*Write a program that asks the user for a value. The program should then print the value provided by the user.

Here's a couple of examples:
Sample output

Give a number:
3
You gave the number 3
Sample output

Give a number:
42
You gave the number 42 */