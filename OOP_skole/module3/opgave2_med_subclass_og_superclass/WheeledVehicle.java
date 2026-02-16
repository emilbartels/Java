package OOP_skole.module3.opgave2_med_subclass_og_superclass;

public class WheeledVehicle {
    private String color;
    private int wheels;
    private String material;

    public static String move(String direction){
        return "Du bevæger dig i denne direction: " + direction;
    }
}
