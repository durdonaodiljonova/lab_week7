import java.util.Date;

public class FlightInstance {

    Date departureTime;
    String gate;
    FlightStatus status;
    Aircraft aircraft;

    public FlightInstance(Date departureTime, String gate, FlightStatus status, Aircraft aircraft) {
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = status;
        this.aircraft = aircraft;
    }

    public boolean cancel() {
        status = FlightStatus.CANCELLED;
        return true;
    }

    public void updateStatus(FlightStatus status) {
        this.status = status;
    }
}
