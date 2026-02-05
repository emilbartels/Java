import java.util.Scanner;
public class IfAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an age:");
        int age = Integer.valueOf(input.nextLine());
        if(age < 0 && age < 120){
            System.out.println("Impossible");
        }
        else{
            System.out.println("OK");
        }
        
    }
}




/*Write a program that prompts the user to input their age and checks
 whether or not it is possible (at least 0 and at most 120). 
 Only use a single if-command in your program. */