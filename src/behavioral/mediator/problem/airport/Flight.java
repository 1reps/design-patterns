package behavioral.mediator.problem.airport;

// Problem: Flight directly communicates with Runway without mediator
public class Flight {

    private String flightNumber;
    private Runway runway; // Direct dependency on runway

    public Flight(String flightNumber, Runway runway) {
        this.flightNumber = flightNumber;
        this.runway = runway;
    }

    public void land() {
        // Problem: Flight needs to know about runway's internal state
        if (runway.isAvailable()) {
            System.out.println("Flight " + flightNumber + " is landing.");
            runway.setAvailable(false);
        } else {
            System.out.println("Flight " + flightNumber + " is waiting to land.");
        }
    }

    // Problem: Flight needs to know about other flights
    public void checkOtherFlights(Flight[] otherFlights) {
        for (Flight flight : otherFlights) {
            if (flight != this && flight.isLanding()) {
                System.out.println("Flight " + flightNumber + " sees " + 
                    flight.flightNumber + " is landing");
            }
        }
    }

    public boolean isLanding() {
        return !runway.isAvailable();
    }
}