import java.util.Scanner;
public class AdditionFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(input.nextLine());
        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}

/*Give the first number:
73457
Give the second number:
12888
73457 + 12888 = 86345 */