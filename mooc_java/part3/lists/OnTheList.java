package mooc_java.part3.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
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
        System.out.print("Search for? ");
        String find = input.nextLine();
        if(names.contains(find)){
            System.out.println(find + " was found!");
        }
        else{
            System.out.println(find + " was not found!");
        }
    }
}