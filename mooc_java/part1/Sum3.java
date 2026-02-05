import java.util.Scanner;
public class sum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(input.nextLine());
        System.out.println("Give me the third number:");
        int value3 = Integer.valueOf(input.nextLine());
        int sum = value1 + value2 + value3;
        System.out.println("The sum is " + sum);
    }
}

/*Give the first number:
8
Give the second number:
2
The average is 5.0 */