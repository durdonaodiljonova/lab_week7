import java.util.*;

public class FlightReservation {

    String reservationNumber;
    FlightInstance flight;
    Map<Passenger, Seat> seatMap = new HashMap<>();
    Date creationDate;
    ReservationStatus status;

    public FlightReservation(String reservationNumber, FlightInstance flight) {
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.creationDate = new Date();
        this.status = ReservationStatus.REQUESTED;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(seatMap.keySet());
    }
}
