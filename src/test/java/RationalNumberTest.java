import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RationalNumberTest {

    @Test
    void test() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new RationalNumber(1, 0),
                "Must not accept denominator equal to 0");

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new RationalNumber(null, 0),
                "Must not accept null numerator");

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new RationalNumber(1, null),
                "Must not accept null denominator");
    }
}
