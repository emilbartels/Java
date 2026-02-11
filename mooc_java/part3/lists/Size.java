package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        // create the word list for storing strings
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        boolean q = true;
        System.out.println("Skriv navne i en liste: (q to quit)");
        while (q != false){
            String navn = input.nextLine();
            if (navn.equals("q")){
                q = false;
            }
            else{names.add(navn);}
        }
        int antal = names.size();
        System.out.println("Der er " + antal + " navne i listen nu.");
        System.out.println("Her er de: ");

        for (int i = 0; i < antal; i++){
            System.out.println(names.get(i));
        }
    }
}
