public class Droid {
    private int batteryLevel;
    private String name;

    public Droid(String droidName) {
        setName(droidName);
        setBatteryLevel(100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "Hello, I'm the droid: " + getName();
    }

    public void performTask(String task) {
        System.out.println(getName() + " is performing task: " + task);
        setBatteryLevel(getBatteryLevel() - 10);
    }

    public void energyReport() {
        System.out.println(getName() + "'s battery level: " + getBatteryLevel());
    }

    public void energyTransfer(Droid otherDroid) {
        int energyExchange = 20;
        if (getBatteryLevel() >= energyExchange && otherDroid.getBatteryLevel() + energyExchange <= 100) {
            setBatteryLevel(getBatteryLevel() - energyExchange);
            otherDroid.setBatteryLevel(otherDroid.getBatteryLevel() + energyExchange);
            System.out.println(getName() + " transferred " + energyExchange + " battery level to " + otherDroid.getName());
        } else {
            System.out.println(getName() + " doesn't have enough battery level to transfer.");
        }
    }
}