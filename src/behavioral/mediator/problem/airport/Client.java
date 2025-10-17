package behavioral.mediator.problem.airport;

public class Client {

    public static void main(String[] args) {
        // Problem: Client needs to manage all interactions between objects
        Runway runway = new Runway();
        
        Flight flight1 = new Flight("KE123", runway);
        Flight flight2 = new Flight("OZ456", runway);
        
        // Problem: Complex interaction management in client code
        flight1.land();
        runway.setCurrentFlight(flight1);
        
        flight2.land(); // Should wait
        
        // Problem: Client needs to coordinate between objects manually
        runway.clear();
        flight2.land(); // Now can land
        
        // Problem: Tight coupling - each object knows about others
        Flight[] allFlights = {flight1, flight2};
        flight1.checkOtherFlights(allFlights);
        
        System.out.println("\nProblems demonstrated:");
        System.out.println("1. Tight coupling between Flight and Runway");
        System.out.println("2. Client manages complex object interactions");
        System.out.println("3. Objects know about each other's internal state");
        System.out.println("4. Difficult to add new aircraft types or runway types");
    }
}