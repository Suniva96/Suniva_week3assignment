class SmartDevice {
    String brand;
    String model;
    public  SmartDevice(String brand, String model){
     this.brand= brand;
     this.model=model;
    }

    public void turnOn(){
        System.out.println("Turnning on the smart device");
    }
    public void turnOff(){
        System.out.println("Turning off the device");
    }
}
 class SmartPhone extends SmartDevice{
    public SmartPhone (String brand,String model){
        super(brand,model);
    }
    @Override
    public void turnOn () {
        System.out.println("Turning on the phone: " +brand+ " " +model);
    }
    @Override 
    public void turnOff(){
        System.out.println("Turning off the phone: " +brand+ " "+model);
    }

 }

class SmartWatch extends SmartDevice{
    public SmartWatch(String brand,String model){
        super(brand,model);

    }
    @Override
    public void turnOn(){
        System.out.println("Switch on :" +brand+ ""+model);
    }
    @Override
    public void turnOff(){
        System.out.println("Switch off :" +brand+""+model);
    }
    }

    public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartPhone("Redmi", "Redmi14pro5g");
        SmartDevice device2 = new SmartWatch("Apple", "Series5");

        device1.turnOn();
        device1.turnOff();

        System.out.println();

        device2.turnOn();
        device2.turnOff();
    }
}
