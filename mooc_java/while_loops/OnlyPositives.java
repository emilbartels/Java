package mooc_java.while_loops;
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            else if (input < 0) {
                double powerOfTwo = Math.pow(input,2);
                System.out.println((int)powerOfTwo);
            }
            else {
                System.out.println("Unfit Number nigge");
            }
            
        }
    }
}
