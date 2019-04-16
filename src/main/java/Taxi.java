public class Taxi {

    final double BASE_FEE = 6.0;
    final double BASE_DISTANCE = 2.0;

    final double DISTANCE_FEE = 0.8;

    final double LONG_DISTANCE = 8.0;
    final double LONG_DISTANCE_RATE = 0.5;

    public Double calculate(Double distance) {
        return BASE_FEE + getDistanceFee(distance) + getLongDistanceFee(distance);
    }

    private double getLongDistanceFee(Double distance) {
        return (distance - LONG_DISTANCE <= 0) ?
                0 : (distance - LONG_DISTANCE) * DISTANCE_FEE * LONG_DISTANCE_RATE;
    }

    private double getDistanceFee(Double distance) {
        return (distance - BASE_DISTANCE <= 0) ?
                0 : (distance - BASE_DISTANCE) * DISTANCE_FEE;

    }
}
