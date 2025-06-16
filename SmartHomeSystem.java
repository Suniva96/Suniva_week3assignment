class Device {
    String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public void operate() {
        System.out.println("Operating device: " + deviceName);
    }
}

class Light extends Device {
    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(deviceName + " light turned ON.");
    }
}

class Thermostat extends Device {
    private int temperature;

    public Thermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void operate() {
        System.out.println(deviceName + " thermostat set to " + temperature + "celcius.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(deviceName + " camera started recording.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = new Device[] {
            new Light("Living Room"),
            new Thermostat("Hallarea", 22),
            new SecurityCamera("Front Door")
        };

        for (Device device : devices) {
            device.operate();
        }
    }
}
