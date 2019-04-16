public class Taxi {

    final double BASE_COST = 6.0;
    final double BASE_DISTANCE = 2.0;

    public Double calculate(Double distance) {

        if (distance <= BASE_DISTANCE) {
            return BASE_COST;
        } else if (distance <= 8) {
            return BASE_COST + (distance - BASE_DISTANCE) * 0.8;
        }

        return 0.0;
    }
}
