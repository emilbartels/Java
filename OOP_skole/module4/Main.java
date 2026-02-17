package OOP_skole.module4;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        //ARRAY *********************** ARRAY
        //Erklæring af arrayet
        Bicycle[] arrayOfBicycles = new Bicycle[100];

        /* 
        //Loop for at fylde array op
        for (int i = 0; i < 100; i++){
            String navn = "myBicycle_" + i;
            Bicycle cykel = new Bicycle(r.nextInt(100), r.nextInt(1000), navn);
            arrayOfBicycles[i] = cykel;
        }
        
        //Loop for at printe i arrayet
        for (int i = 0; i < 100; i++){
            System.out.println("Her er cykel navn: " + arrayOfBicycles[i].getName() + " og her er gearet: " + arrayOfBicycles[i].getGear());
        }
        */

        
        //LINKED LIST ******************** LINKED LIST

        LinkedList<Bicycle> linkedBikes = new LinkedList<Bicycle>();

        //Putter objekter i listen
        for (int i = 0; i < 100; i++) {
            String navn = "myBicycle_" + i;
            Bicycle cykel = new Bicycle(r.nextInt(100), r.nextInt(1000), navn);
            linkedBikes.add(cykel);
        }

        
        //Får printed information om dem alle:
        for (int i = 0; i < linkedBikes.size(); i++) {
            System.out.println("Her er cykel navn: " + linkedBikes.get(i).getName() + " og her er gearet: " + linkedBikes.get(i).getGear() + " og her er farten " + linkedBikes.get(i).getSpeed());
        }
        
        System.out.println("");
        System.out.println("");
        // STACK ************************************ STACK
        Stack<Bicycle> stack = new Stack<>();

        for (int i = 0; i < 100; i++){
            stack.push(linkedBikes.get(i));
            Bicycle poppedBike = stack.pop();              // dette er objektet der poppes
            poppedBike.setSpeed((int)(poppedBike.getSpeed() * 0.75)); // ændrer på samme objekt
            System.out.println("Vi popper: " + poppedBike.getName() + " ny speed: " + poppedBike.getSpeed());
        }
        
    }
}
