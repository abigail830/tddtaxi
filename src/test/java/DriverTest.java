import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTest {

    @Test
    void should_get_wait_charge_per_min() {
        verifyDriverCharge(2.0, 1, 6.25);
    }

    private void verifyDriverCharge(Double distance, int waitMin, Double expectAmount) {
        //given
        final Taxi taxi = new Taxi();
        final Driver driver = new Driver(taxi);

        //when
        Double charge = driver.charge(distance, waitMin);

        //then
        Assertions.assertEquals(expectAmount, charge);
    }

}
