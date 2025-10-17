package behavioral.mediator.resolve.airport;

public class Runway {

    private AirportMediator mediator;

    public Runway(AirportMediator mediator) {
        this.mediator = mediator;
    }

    public void clear() {
        System.out.println("Runway is clear.");
        mediator.setRunwayAvailability(true);
    }
}
