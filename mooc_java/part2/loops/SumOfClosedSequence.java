import java.util.Scanner;

public class SumOfClosedSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number? ");
        int from = Integer.valueOf(input.nextLine());
        System.out.print("Last number? ");
        int to = Integer.valueOf(input.nextLine());
        int sum = 0;

        for (int i = from; i <= to; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
