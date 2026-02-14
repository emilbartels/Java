package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        //Ny logic der skal finde index af et tal
        System.out.println("Search for: ");
        int searchedTal = input.nextInt();
        int i = 0;
        while (i < antal){
            if (numbers.get(i) == searchedTal){
                System.out.println(searchedTal + " is at index " + i);
            }
            i++;
        }

        System.out.println("Her er alle tallene: ");
        for (int nummer: numbers) {
            System.out.println(nummer);
        }

    }
}
