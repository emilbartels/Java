package OOP_skole.module4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
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
        
        // Priority queue ****************************** Priority queue
        PriorityQueue<Bicycle> prioritetCykel = new PriorityQueue<>((a, b) -> Integer.compare(a.getSpeed(), b.getSpeed()));

        
        for (int i = 0; i < 100; i++){
            prioritetCykel.add(linkedBikes.get(i));
        }

        //Then increase speed for each bicycle by 25% in the same order as you inserted the bicycles
        for (int i = 0; i < 100; i++){
            Bicycle cykel = linkedBikes.get(i);              // dette er objektet der poppes
            cykel.setSpeed((int)(cykel.getSpeed() * 1.25)); // ændrer på samme objekt
        }
        System.out.println("");
        System.out.println("");
        System.out.println("\nEfter 2b (speed * 1.25 i insert-order):");
        for (int i = 0; i < 100; i++) {
            Bicycle b = linkedBikes.get(i);
            System.out.println(b.getName() + " speed: " + b.getSpeed());
        }

        //Fjerner dem under 100 km/h
        Iterator<Bicycle> it = linkedBikes.iterator();
        while (it.hasNext()) {
            Bicycle b = it.next();
            if (b.getSpeed() <= 100) { // eller < 10 hvis du følger opgaven
            it.remove();           
            }
        }

        //Counter for hvor mange cykler der nu findes:
        int counter = 0;
        for (Bicycle b : linkedBikes) {
            counter++;
        }
        System.out.println("Efter at vi har removed bikes under 100 km/h er der nu: " + counter);

        //Hashmap *************************** Hashmap
        Scanner input = new Scanner(System.in);

        HashMap<String, Bicycle> hashedBicycle = new HashMap<>();

        System.out.println("");
        System.out.println("");
        System.out.println("To quit enter 'exit'");
        System.out.print("Input key-names for hashtable: ");
        for (int i = 0; i < linkedBikes.size(); i++) {
            String key = input.nextLine();
            if (key.equals("exit")){
                break;
            }
            hashedBicycle.put(key, linkedBikes.get(i));
            System.out.println("Key " + key + " svarer til " + hashedBicycle.get(key).getName()); 
        }
        
        
        /*
        Use a hashmap to organize the remaining bicycles and add a possibility to input a name from the user. Use
the inputted name to search and find the hashmapped bicycle and print its info. Repeat this until the user
types “exit”.
 */
    }
}
