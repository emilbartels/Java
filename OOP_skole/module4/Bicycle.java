package OOP_skole.module4;

public class Bicycle {
    //attributer
    private int gears;
    private int speed;
    private String name;

    //constructor
    public Bicycle(int gears, int speed, String name){
        this.gears = gears; 
        this.speed = speed;
        this.name = name;
    }

    //Getter & setter med speed
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    //Getter & setter med gears
    public int getGear(){
        return gears;
    }
    public void setGears(int gears){
        this.gears = gears;
    }

    //gettter & setter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
