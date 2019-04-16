import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiTest {

    @Test
    void should_return_6_when_less_then_2KM() {
        verifyTaxtCalculation(1.0, 6.0);
        verifyTaxtCalculation(2.0, 6.0);
    }

    private void verifyTaxtCalculation(Double distance, Double expectAmount) {
        //given
        Taxi taxi = new Taxi();
        //when
        Double amout = taxi.calculate(distance);
        //then
        assertEquals(expectAmount, amout);
    }


}
