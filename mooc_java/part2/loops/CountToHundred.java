import java.util.Scanner;

public class CountToHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.valueOf(input.nextLine());

        for (int i = 100; number <= i; number++) {
            System.out.println(number);        
        }

    }
}
