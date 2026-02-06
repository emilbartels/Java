import java.util.Scanner;

public class Doubleconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number:");  
        Double number = Double.valueOf(input.nextLine());
        System.out.println("You gave the number " + number);
    }
}
