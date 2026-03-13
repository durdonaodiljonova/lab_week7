import java.util.ArrayList;
import java.util.List;

public class Airport {

    String name;
    Address address;
    String code;

    List<Flight> flights = new ArrayList<>();

    public Airport(String name, Address address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
