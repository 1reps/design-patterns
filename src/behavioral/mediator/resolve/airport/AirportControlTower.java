package behavioral.mediator.resolve.airport;

public class AirportControlTower implements AirportMediator {

    private boolean isRunwayAvailable = true;

    @Override
    public boolean isRunwayAvailable() {
        return isRunwayAvailable;
    }

    @Override
    public void setRunwayAvailability(boolean status) {
        isRunwayAvailable = status;
    }
}
