import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero(){
        Calculator calculator = new Calculator(0);
        assertEquals(0, calculator.getValue());
    }

}
