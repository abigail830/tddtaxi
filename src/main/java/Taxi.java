public class Taxi {

    public Double calculate(Double distance) {
        if (distance <= 2.0) {
            return 6.0;
        } else if (distance <= 8) {
            return 6.0 + (distance - 2.0) * 0.8;
        }

        return 0.0;
    }
}
