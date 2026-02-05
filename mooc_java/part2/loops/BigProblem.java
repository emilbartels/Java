import java.util.Scanner;

public class BigProblem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;
        int sum = 0;
        int antal = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        

        while (true) {
            number = reader.nextInt();

            if(number == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            else{
                if(number % 2 == 0){even++;}
                if(number % 2 == 1){odd++;}
                antal++;
                sum += number;
            }

        }
        avg = (double)sum / antal;
        System.out.println("sum: "+ sum);
        System.out.println("numbers: " + antal);
        System.out.println("average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        // functionality to execute after the loop ends
    }
}
