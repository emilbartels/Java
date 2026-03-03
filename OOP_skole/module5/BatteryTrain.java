package OOP_skole.module5;

public class BatteryTrain extends Train implements ElectricTrain {
private int batteryLevel;
public BatteryTrain(int initialCharge) {
this.batteryLevel = initialCharge;
}
@Override
public void chargeBattery(int kWh) { batteryLevel += kWh; }
@Override
public int getBatteryLevel() { return batteryLevel; }
@Override
public boolean needsCharging() { return batteryLevel < 20; }
}
