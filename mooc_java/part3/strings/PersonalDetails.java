package mooc_java.part3.strings;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Skriv navn og årstal: emil,2005: ");

        //sætter variabler op til loop
        String longestString = "e";
        int helperlength = longestString.length();
        int sum = 0;
        int count = 0;
        while (true) {
            //Læser input fra brugeren
            String input = reader.nextLine();

            if (input.equals("")) {
                break;
            }

            //splitter op i små stykker så man kan læse alder
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);

            //finder længeste navn
            if (parts[0].length() >= helperlength){
                longestString = parts[0];
                helperlength = longestString.length();
            }

            count = count + 1;
        }
        double average = (double)sum / count;
        System.out.println("Longest name: " + longestString);
        System.out.println("Average of the birth years: " + average);
    }
}


/*
Write a program that reads names and ages from the user until an empty line is entered. 
The name and age are separed by a comma.

After reading all user input, the program prints the name
 of the oldest person. You can assume that the user enters
at least one person, and the that one of the users is 
older than the others.

sebastian,2017
lucas,2017
lily,2017
hanna,2014
gabriel,2009

Longest name: sebastian
Average of the birth years: 2014.8 
*/