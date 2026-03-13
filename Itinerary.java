import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Itinerary {

    String customerId;
    Airport startingAirport;
    Airport finalAirport;
    Date creationDate;

    List<FlightReservation> reservations = new ArrayList<>();

    public List<FlightReservation> getReservations() {
        return reservations;
    }

    public boolean makeReservation() {
        return true;
    }

    public boolean makePayment() {
        return true;
    }
}
