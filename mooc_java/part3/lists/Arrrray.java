package mooc_java.part3.lists;
import java.util.ArrayList;

public class Arrrray {
    public static void main(String[] args) {
        // create the word list for storing strings
        ArrayList<String> names = new ArrayList<>();

        // add four values to the word list
        names.add("Tom");
        names.add("Emma");
        names.add("Alex");
        names.add("Mary");

        // retrieve the value from position 0 of the word list, and print it
        System.out.println(names.get(2));
    }
}
