import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    String frequentFlyerNumber;
    List<Itinerary> itineraries = new ArrayList<>();

    public Customer(String name, Address address, String email, String phone, String frequentFlyerNumber) {
        super(name, address, email, phone);
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }
}
