package OOP_skole.module3.opgave2_med_subclass_og_superclass;

class Light {
private final String position;
private boolean on = false;
public Light(String position) {
this.position = position;
}
public void switchOn() {
if (!on) {
on = true;
System.out.println(position + " light on.");
}
}
public void switchOff() {
if (on) {
on = false;
System.out.println(position + " light off.");
}
}
}
