import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTest {


    @Test
    void should_get_wait_charge_per_min() {
        //given
        final Taxi taxi = new Taxi();
        final Driver driver = new Driver(taxi);

        //when
        Double charge = driver.charge(2.0, 1);

        //then
        Assertions.assertEquals(6.25, charge);
    }

}
