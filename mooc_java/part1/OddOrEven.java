import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(input.nextLine());
        if((number % 2) == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
