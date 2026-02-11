package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseIndexes {
    public static void main(String[] args) {
        // create the word list for storing strings
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        boolean q = true;
        System.out.println("Skriv tal i en liste: (-1 to quit)");
        while (q != false){
            int tal = input.nextInt();
            if (tal == -1){
                q = false;
            }
            else{numbers.add(tal);}
        }
        int antal = numbers.size();
        System.out.println("Der er " + antal + " tal i listen nu.");

        //Ny logic der tager tal fra x til y
        System.out.print("From which index? ");
        int start = input.nextInt();
        System.out.print("To which index? ");
        int ende = input.nextInt();

        for (int i = start; i <= ende; i++){
            System.out.println(numbers.get(i));
        }
    }
}
