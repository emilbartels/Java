package OOP_skole.module3.opgave2_med_subclass_og_superclass;

abstract class Brake {
private final String position;
protected Brake(String position) {
this.position = position;
}
public void apply() {
System.out.println(position + " brake applied.");
}
}
class FrontBrake extends Brake {
public FrontBrake() { super("Front"); }
}
class RearBrake extends Brake {
public RearBrake() { super("Rear"); }
}
