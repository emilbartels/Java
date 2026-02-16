package mooc_java.part3.arrays;
import java.util.Scanner;

public class Arrayyyy {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 3;
    numbers[2] = 5;
    numbers[3] = 7;
    numbers[4] = 9;
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);

    System.out.println("give 2 indices to swap: ");
    int nummer1 = input.nextInt();
    int nummer2 = input.nextInt();
    
    int helper = numbers[nummer1];
    numbers[nummer1] = numbers[nummer2];
    numbers[nummer2] = helper;
    
    System.out.println(" ");
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);
    }
    

    
}
