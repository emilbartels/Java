public class HelloWorld { //Class
    public static void main(String[] args){ //Main metoden
        System.out.println("Hello World");

        if (args.length == 0){
            System.out.println("Du mangler text line as an argument");
            return;
        }

        System.out.println(args[0]);
    }
}
