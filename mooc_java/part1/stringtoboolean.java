import java.util.Scanner;

public class stringtoboolean {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write something:");
        Boolean bool = Boolean.valueOf(input.nextLine());
        System.out.println("True or false? " + bool);
    }
}
