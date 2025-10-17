package behavioral.mediator.problem.airport;

// Problem: Runway exposes its internal state directly
public class Runway {

    private boolean available = true;
    private Flight currentFlight; // Direct reference to flight

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void clear() {
        System.out.println("Runway is clear.");
        available = true;
        if (currentFlight != null) {
            System.out.println("Notifying flight " + currentFlight + " that runway is clear");
            currentFlight = null;
        }
    }

    public void setCurrentFlight(Flight flight) {
        this.currentFlight = flight;
    }
}