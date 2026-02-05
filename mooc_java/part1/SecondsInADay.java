import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        Scanner input = new Scanner(System.in);
System.out.println();
        ("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(input.nextLine());
        int hoursInDay =24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInDay = secondsInMinute * minutesInHour * hoursInDay * numberOfDays;

        System.out.println("There are " + secondsInDay + " seconds in " + numberOfDays + " day");
    }

}
