import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiTest {

    @Test
    public void should_return_6_when_less_then_2KM() {
        //given
        Taxi taxi = new Taxi();
        //when
        Double amoutFor1 = taxi.calculate(1.0);
        Double amoutFor2 = taxi.calculate(2.0);
        //then
        assertEquals(6.0, amoutFor1);
        assertEquals(6.0, amoutFor2);
    }
}
