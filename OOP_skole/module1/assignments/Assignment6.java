package OOP_skole.module1.assignments;
import java.util.Random;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int randomNummer = random.nextInt(11);
        int guesses = 0;
        int inputNummer = 0;
        System.out.println("Du har 3 gæt til at gætte et tal mellem 0-10");
        do { 
            System.out.print("Input dit gæt: ");
            inputNummer = input.nextInt();
            guesses++;
            if(inputNummer == randomNummer){
                System.out.println("DU HAR GÆTTET KORREKT!!!");
                break;
            }
            else if(inputNummer < randomNummer){
                System.out.println("Du gættede for lavtm prøv igen :)");
                System.out.println("Du har brugt " + guesses);
            }
            else if(inputNummer > randomNummer){
                System.out.println("Du gættede for højt, prøv igen :)");
                System.out.println("Du har brugt " + guesses);
            }
        } while (guesses < 3);
        

        
    }
}   

/*Using the Random class (import java.util.Random) it is possible to generate
random numbers. Create a guessing-program that takes a number at user
input and compares this to a random number. The program should tell the
user if his/her number is too high or too low. 
Give the user either an infinite number of tries to guess 
the random number or specify a maximum number, say three tries maybe */