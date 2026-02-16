package OOP_skole.module3.opgave2_med_subclass_og_superclass;

public class RacerBike {
    private RacerGearSystem gears = new RacerGearSystem();
    public static String kørHurtigt(Boolean bool){
        if (bool == true){
            return "DU KØRER HURTIGT";
        }
        else{
            return "Du kan ikke finde ud af køre hurtigt";
        }
    }
}
