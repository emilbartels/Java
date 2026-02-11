package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumber {
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
        System.out.print("From where? ");
        int start = input.nextInt();
        System.out.print("To where? ");
        int ende = input.nextInt();

        int i = 0;
        while (i < antal){
            int talFraArray = numbers.get(i);
            if (talFraArray >= start && talFraArray <= ende){
                System.out.println(talFraArray);
            }
            i++;
        }

        
    }
}
