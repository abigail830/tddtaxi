import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiTest {

    @Test
    void should_return_6_when_less_then_2KM() {
        verifyTaxtCalculation(1.0, 6.0);
        verifyTaxtCalculation(2.0, 6.0);
    }

    @Test
    void should_add_0_8_when_distance_between_2_to_8() {
        verifyTaxtCalculation(3.0, 6.8);
        verifyTaxtCalculation(8.0, 10.8);

        verifyTaxtCalculation(2.5, 6.4);
    }

    @Test
    void should_add_50_peasant_fee_when_distance_more_than_8() {
        verifyTaxtCalculation(9.0, 12.0);
    }


    private void verifyTaxtCalculation(Double distance, Double expectAmount) {
        //given
        Taxi taxi = new Taxi();
        //when
        Double amout = taxi.calculate(distance);
        //then
        assertEquals(expectAmount, amout, 0.001);
    }


}
