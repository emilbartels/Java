import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in);
        System.out.println("Enter the first string:");  
        String string1 = inputRead.nextLine();
        System.out.println("Enter the second string:");  
        String string2 = inputRead.nextLine();
        
        if(string1.equals(string2)){
            System.out.println("Same string");
        }
        else{
            System.out.println("Different strings");
        }
    }
}


/*Enter the first string:
hello
Enter the second string:
hello
Same */