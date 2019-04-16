public class Driver {

    private Taxi taxi;

    public Driver(Taxi taxi) {
        this.taxi = taxi;
    }

    public Double charge(double distance, int waitMin) {
        return taxi.calculate(distance) + waitMin * 0.25;
    }
}
