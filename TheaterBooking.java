class Seat {
    String seatNumber;  

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void bookSeat() {
        System.out.println("Booking seat " + seatNumber);
    }
}

class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Regular seat " + seatNumber + " booked.");
    }
}

class PremiumSeat extends Seat {
    boolean snackIncluded;
    double luxuryTax;

    public PremiumSeat(String seatNumber) {
        super(seatNumber);
        this.snackIncluded = true;  
        this.luxuryTax = 15.0;      
    }

    @Override
    public void bookSeat() {
        System.out.println("Premium seat " + seatNumber + " booked.");
        System.out.println("Snack included: " + (snackIncluded ? "Yes" : "No"));
        System.out.println("Luxury tax applied: " + luxuryTax + "%");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat regular = new RegularSeat("R12");
        Seat premium = new PremiumSeat("P5");

        regular.bookSeat();
        System.out.println();
        premium.bookSeat();
    }
}
