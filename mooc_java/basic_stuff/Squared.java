package mooc_java.basic_stuff;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer to be squared: ");
        int integer = Integer.valueOf(scanner.nextLine());
        int squared = (integer * integer);
        System.out.println(squared);

    }
}
