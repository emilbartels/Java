import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = Integer.valueOf(input.nextLine());
        
        if((year % 100 == 0 && year % 400 == 0) && (year % 4 == 0)){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("The year " + year + " is NOT a leap year");
        }
    }
}

/*Give a year: 2011
The year is not a leap year.

*/
/*A year is a leap year if it is divisible by 4. 
However, if the year is divisible by 100, then it is a leap year 
only when it is also divisible by 400.
Write a program that reads a year from the user, 
and checks whether or not it is a leap year. */