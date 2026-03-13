import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    String name;
    String model;
    int manufacturingYear;

    List<Seat> seats = new ArrayList<>();

    public Aircraft(String name, String model, int manufacturingYear) {
        this.name = name;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }
}
