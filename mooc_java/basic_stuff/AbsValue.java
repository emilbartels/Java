package mooc_java.basic_stuff;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer1 = Integer.valueOf(scanner.nextLine());
        if (integer1 < 0) {
            int absoluteValue = integer1 * -1;
            System.out.println(absoluteValue);
        } else {
            int absoluteValue = integer1;
            System.out.println(absoluteValue);
        }

    }
}
