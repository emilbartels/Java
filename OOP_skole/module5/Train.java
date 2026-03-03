package OOP_skole.module5;

public class Train implements Vehicle {
    private Locomotive locomotive;
    private List<Wagon> wagons;
    private int speed;
    @Override
    public void start() { /* common behaviour */ }
    @Override
    public void stop() { speed = 0; }
    @Override
    public void accelerate(int amount) { speed += amount; }
    @Override
    public void decelerate(int amount) { speed -= amount; }
}
