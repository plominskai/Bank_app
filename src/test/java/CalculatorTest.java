import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void check_if_add_method_returns_positive_number() {

        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }
}
