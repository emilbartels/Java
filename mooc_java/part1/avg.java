import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(input.nextLine());
        double avg = ((double)value1 + value2) / 2;
        System.out.println("The average is " + avg);
    }
}

/*Give the first number:9

8
Give the second number:
2
The average is 5.0 */