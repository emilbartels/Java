import java.util.Scanner;
public class Orwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int year = Integer.valueOf(input.nextLine());
        if(year == 1984){
            System.out.println("Orwell");
        }
    }
}
