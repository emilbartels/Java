package OOP_skole.module3.opgave2_med_subclass_og_superclass;

class Bicycle extends WheeledVehicle{
private final GearSystem gears = new GearSystem();
private final Wheel frontWheel = new Wheel("Front");
private final Wheel rearWheel = new Wheel("Rear");
private final FrontBrake frontBrake = new FrontBrake();
private final RearBrake rearBrake = new RearBrake();
private final Light frontLight = new Light("Front");
private final Light rearLight = new Light("Rear");
// --- Ac?ons defined in the original descrip?on ---
public void stepOnPedals() {
System.out.println("Pedaling forward.");
}
public void shitUp() {
gears.shitUp();
}
public void shitDown() {
gears.shitDown();
}
public void applyFrontBrake() {
frontBrake.apply();
}
public void applyRearBrake() {
rearBrake.apply();
}
public void switchLightsOn() {
frontLight.switchOn();
rearLight.switchOn();
}
public void switchLightsOff() {
frontLight.switchOff();
rearLight.switchOff();
}
public void removeFrontWheel() {
frontWheel.remove();
}
public void removeRearWheel() {
rearWheel.remove();
}
public void mountFrontWheel() {
frontWheel.mount();
}
public void mountRearWheel() {
rearWheel.mount();
}
}
