import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = smallest(number1, number2);
        System.out.println("The smallest number is: " + result);
    }

    public static int smallest(int number1, int number2){
        if (number1 > number2){
            return number1;
        }
        else if (number1 < number2){
            return number2;
        }
        return 0;
        
    }
}

/*Define a two-parameter method smallest that returns the smaller
 of the two numbers passed to it as parameters. */