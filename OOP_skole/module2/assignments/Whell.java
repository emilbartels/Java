package OOP_skole.module2.assignments;

public class Whell {
    private int size = 0;
    private int width = 0;
    private double rpm = 0;
    private String color = "nothing";

    public void changeWheels(int inputSize, int inputWidth, String inputColor){
        size = inputSize;
        width = inputWidth;
        color = inputColor;
    }

    private double getRPM(){
        return rpm;
    }

    public static void main(String[] args) {
        
    }
}

