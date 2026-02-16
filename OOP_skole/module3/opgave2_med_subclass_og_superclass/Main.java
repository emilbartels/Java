package OOP_skole.module3.opgave2_med_subclass_og_superclass;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Test: Bicycle ===");
        Bicycle bike = new Bicycle();
        bike.stepOnPedals();
        bike.shitUp();
        bike.shitUp();
        bike.shitDown();
        bike.applyFrontBrake();
        bike.applyRearBrake();
        bike.switchLightsOn();
        bike.removeFrontWheel();
        bike.mountFrontWheel();
        bike.removeRearWheel();
        bike.mountRearWheel();
        bike.switchLightsOff();

        System.out.println("\n=== Test: WheeledVehicle.move() ===");
        System.out.println(WheeledVehicle.move("fremad"));
        System.out.println(WheeledVehicle.move("til venstre"));

        System.out.println("\n=== Test: MountainBike (subclass af Bicycle) ===");
        MountainBike mtb = new MountainBike();
        mtb.stepOnPedals();      // arvet fra Bicycle
        mtb.shitUp();            // arvet fra Bicycle
        System.out.println(MountainBike.lavTrick("bunny hop"));

        System.out.println("\n=== Test: CityBike ===");
        System.out.println(CityBike.kørOverForRødt());

        System.out.println("\n=== Test: RacerBike ===");
        System.out.println(RacerBike.kørHurtigt(true));
        System.out.println(RacerBike.kørHurtigt(false));

        System.out.println("\n=== Test: RacerGearSystem (hvis du har klassen) ===");
        // Hvis din RacerGearSystem findes og har shitUp/shitDown/getGear:
        RacerGearSystem rgs = new RacerGearSystem(); // evt. new RacerGearSystem(21)
        rgs.shitUp();
        rgs.shitUp();
        rgs.shitDown();
        System.out.println("Racer gear nu: " + rgs.getGear());

        System.out.println("\n=== Done ===");
    }
}

