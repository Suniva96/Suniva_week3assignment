class Ticket {
  String ticketNumber;
  double price;

    public Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public String generateTicket() {
        return "Ticket Number: " + ticketNumber + "\nPrice: " + price;
    }
}

class BusTicket extends Ticket {
    String seatNumber;

    public BusTicket(String ticketNumber, double price, String seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String generateTicket() {
        return super.generateTicket() + "\nSeat Number: " + seatNumber;
    }
}
class TrainTicket extends Ticket {
   String coachType;

    public TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    public String getCoachType() {
        return coachType;
    }

    @Override
    public String generateTicket() {
        return super.generateTicket() + "\nCoach Type: " + coachType;
    }
}

class FlightTicket extends Ticket {
      String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    @Override
    public String generateTicket() {
        return super.generateTicket() + "\nBoarding Gate: " + boardingGate;
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        BusTicket bus = new BusTicket("Bus-5001", 250, "A12");
        TrainTicket train = new TrainTicket("Train-101", 350, "First Class");
        FlightTicket flight = new FlightTicket("Flight-999", 1100, "Gate 5");

        Ticket[] tickets = { bus, train, flight };

        for (Ticket ticket : tickets) {
            System.out.println("Ticket Details ");
            System.out.println(ticket.generateTicket());
            System.out.println();
        }
    }
}
