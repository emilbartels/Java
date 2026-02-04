package mooc_java.while_loops;
import java.util.Scanner;


public class RVThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 4) {
                break;
            }
        }
    }
}
