package mooc_java.while_loops;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int antalNumre = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            
            antalNumre = antalNumre + 1;
            sum = sum + input;
        }
        System.out.println("Number of negative numbers: " + antalNumre);
        System.out.println("Sum of numbers: " + sum);
    }
}