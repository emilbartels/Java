package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>();
        Scanner indlæsning = new Scanner(System.in);

        int input = 1;
        System.out.println("Indtast tal du vil have i et array. (0 = quit): ");
        while (input != 0) {
            input = indlæsning.nextInt();
            tal.add(input);
        }
        System.out.println("First number: " + tal.get(0));
        System.out.println("Sum of second & third: " + (tal.get(1) + tal.get(2)));
    } 
}
