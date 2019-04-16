public class Driver {

    private Taxi taxi;
    final double WAIT_FEE = 0.25;

    public Driver(Taxi taxi) {
        this.taxi = taxi;
    }

    public double charge(double distance, int waitMin) {
        return Math.round(taxi.calculate(distance) + waitMin * WAIT_FEE);
    }
}
