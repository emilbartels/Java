import java.util.Scanner;
public record Calc() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(input.nextLine());
        int plus = number1 + number2;
        int minus = number1 - number2;
        int gange = number1 * number2;
        double division = number1 / number2;
        System.out.println(number1 + " + " + number2 + " = " + plus);
        System.out.println(number1 + " - " + number2 + " = " + minus);
        System.out.println(number1 + " * " + number2 + " = " + gange);
        System.out.println(number1 + " / " + number2 + " = " + division);
    }
}

/*
Give the first number:
8
Give the second number:
2
8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0
 */