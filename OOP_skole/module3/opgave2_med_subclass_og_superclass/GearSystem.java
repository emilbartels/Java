package OOP_skole.module3.opgave2_med_subclass_og_superclass;

class GearSystem {
private int gear = 1;
public void shitUp() {
if (gear < 7) {
gear++;
System.out.println("Shiting up: now in gear " + gear);
} else {
System.out.println("Already in highest gear.");
}
}
public void shitDown() {
if (gear > 1) {
gear--;
System.out.println("Shiting down: now in gear " + gear);
} else {
System.out.println("Already in lowest gear.");
}
}
public int getGear() {
return gear;
}
}
