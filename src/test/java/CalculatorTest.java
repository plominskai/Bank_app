import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @BeforeEach
    @Test
    void check_if_add_method_returns_positive_number() {

        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @DisplayName("odejmowanie")
    @Test
    void check_if_sub_method_returns_positive_number() {
        Assertions.assertEquals(5, calculator.subtract(10, 5));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void adding(int a, int b, int c) {
        Assertions.assertEquals(c, calculator.add(a, b));
    }

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(2, 6, 8),
                Arguments.of(7, 13, 100),
                Arguments.of(8, 20, 28)
        );
    }
}