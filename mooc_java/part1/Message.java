import java.util.Scanner;

public class Message{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        //Create an instance of the scanner class called scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String message = scanner.nextLine();
        System.out.println(message);
        scanner.close();
    }
}


