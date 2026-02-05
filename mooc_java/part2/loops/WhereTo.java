import java.util.Scanner;

public class WhereTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Where to: ");
        int to = Integer.valueOf(input.nextLine());
        System.out.print("Where from: ");
        int from = Integer.valueOf(input.nextLine());
        for (int i = from; i <= to; i++){
            System.out.println(i);
        }
    }
}
