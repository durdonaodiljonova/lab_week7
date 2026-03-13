import java.util.ArrayList;
import java.util.List;

public class Flight {

    String flightNumber;
    Airport departure;
    Airport arrival;
    int durationInMinutes;

    List<FlightInstance> flightInstances = new ArrayList<>();

    public Flight(String flightNumber, Airport departure, Airport arrival, int durationInMinutes) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.durationInMinutes = durationInMinutes;
    }
}
