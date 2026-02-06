import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(input.nextLine());
        if(grade < 0){
            System.out.println("Impossible!");
        }
        else if (grade < 50) {
            System.out.println("Failed");
        }
        else if (grade < 60) {
            System.out.println("1");
        }
        else if (grade < 70) {
            System.out.println("2");
        }
        else if (grade < 80) {
            System.out.println("3");
        }
        else if (grade < 90) {
            System.out.println("4");
        }
        else if (grade <= 100) {
            System.out.println("5");
        }
        else if (grade > 100) {
            System.out.println("Incredible!");
        }
    }
}


/*points	grade
< 0	impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible! */