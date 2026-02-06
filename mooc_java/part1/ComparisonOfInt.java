import java.util.Scanner;
public class ComparisonOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(input.nextLine());
        System.out.println("Give the first number:");
        int number2 = Integer.valueOf(input.nextLine());

        if(number1 > number2){
            int greaterNumber = number1;
            System.out.println("Greater number is: " + greaterNumber);
        }
        else if(number1 < number2){
            int greaterNumber = number2;
            System.out.println("Greater number is: " + greaterNumber);
        }
        else{
            System.out.println("The numbers are equal");
        }
        
    }
      
}

/*
Give the first number:
5
Give the second number:
3
Greater number is: 5 
*/