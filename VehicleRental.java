abstract class Vehicle {
    private String plateNumber;
    private double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public abstract double calculateRental(int days);
}

class Car extends Vehicle {
    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate() * days;
    }
}

class Truck extends Vehicle {
    private double loadFee;

    public Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return (getBaseRate() * days) + loadFee;
    }
}

class Bike extends Vehicle {
    private double fixedRate;

    public Bike(String plateNumber, double fixedRate) {
        super(plateNumber, 0); 
        this.fixedRate = fixedRate;
    }

    @Override
    public double calculateRental(int days) {
        return fixedRate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(" 4005", 1000);
        vehicles[1] = new Truck("5678", 1500, 2000);
        vehicles[2] = new Bike("9012", 500);

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Plate: " + v.getPlateNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: Rs. " + v.calculateRental(rentalDays));
        }
    }
}
