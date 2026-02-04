package mooc_java.basic_stuff;

import java.util.Scanner;

public class NumComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gets the two ints
        int integer1 = Integer.valueOf(scanner.nextLine());
        int integer2 = Integer.valueOf(scanner.nextLine());

        // compares the two ints
        if (integer1 > integer2) {
            System.out.println(integer1 + " is greater than " + integer2 + ".");
        } else if (integer1 < integer2) {
            System.out.println(integer1 + " is smaller than " + integer2 + ".");
        } else {
            System.out.println(integer1 + " is equal to " + integer2 + ".");
        }

    }
}
