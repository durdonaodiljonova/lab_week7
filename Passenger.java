import java.util.Date;

public class Passenger {

    String name;
    String passportNumber;
    Date dateOfBirth;

    public Passenger(String name, String passportNumber, Date dateOfBirth) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
