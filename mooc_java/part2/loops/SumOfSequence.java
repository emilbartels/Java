import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Last number?");
        int to = Integer.valueOf(input.nextLine());

        int sum = 0;

        for (int i = 0; i <= to; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
