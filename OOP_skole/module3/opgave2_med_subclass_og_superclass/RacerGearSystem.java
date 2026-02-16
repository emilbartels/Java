package OOP_skole.module3.opgave2_med_subclass_og_superclass;

public class RacerGearSystem {
    private int gear = 1;
    private final int maxGear;

    public RacerGearSystem() {
        this.maxGear = 21; // racer har fx 21 gear
    }

    public RacerGearSystem(int maxGear) {
        this.maxGear = Math.max(1, maxGear);
        this.gear = 1;
    }

    public void shitUp() {
        if (gear < maxGear) {
            gear++;
            System.out.println("Racer shifting up: now in gear " + gear);
        } else {
            System.out.println("Already in highest gear (" + maxGear + ").");
        }
    }

    public void shitDown() {
        if (gear > 1) {
            gear--;
            System.out.println("Racer shifting down: now in gear " + gear);
        } else {
            System.out.println("Already in lowest gear (1).");
        }
    }

    public int getGear() {
        return gear;
    }
}

