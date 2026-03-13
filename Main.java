import java.util.Date;

public class Main {

    public static void main(String[] args) {

     
        Address address = new Address(
                "Amir Temur Street",
                "Tashkent",
                "Tashkent Region",
                "100000",
                "Uzbekistan"
        );


        Airport airport1 = new Airport("Tashkent International Airport", address, "TAS");
        Airport airport2 = new Airport("Samarkand International Airport", address, "SKD");

        // Create aircraft
        Aircraft aircraft = new Aircraft("Airbus", "A320", 2018);

        
        Flight flight = new Flight("UZ101", airport1, airport2, 90);

        // Create flight instance
        FlightInstance instance = new FlightInstance(
                new Date(),
                "A1",
                FlightStatus.SCHEDULED,
                aircraft
        );

      
        Passenger passenger = new Passenger(
                "Ali Karimov",
                "AA1234567",
                new Date()
        );

        
        FlightReservation reservation = new FlightReservation(
                "RES001",
                instance
        );

        
        System.out.println("Airline Management System Demo");
        System.out.println("--------------------------------");

        System.out.println("Passenger: " + passenger.name);
        System.out.println("Flight Number: " + flight.flightNumber);
        System.out.println("Departure Airport: " + airport1.name);
        System.out.println("Arrival Airport: " + airport2.name);
        System.out.println("Gate: " + instance.gate);
        System.out.println("Reservation Number: " + reservation.reservationNumber);

    }
}
