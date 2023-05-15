import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {1997, 2001, 2005})
    void shouldReturnFalseWhenYearIsNotLeapYear1(int inputYear) {
        boolean isLeapYear = LeapYear.checkLeapYear(inputYear);

        assertFalse(isLeapYear);
    }

    @Test
    void shouldReturnTrueWhenYearIsDivisibleBy4() {
        int inputYear = 1996;

        boolean isLeapYear = LeapYear.checkLeapYear(inputYear);

        assertTrue(isLeapYear);
    }

    @Test
    void shouldReturnTrueWhenYearIsDivisibleBy400() {
        int inputYear = 1600;

        boolean isLeapYear = LeapYear.checkLeapYear(inputYear);

        assertTrue(isLeapYear);
    }

    @Test
    void shouldReturnFalseWhenDivisibleBy100() {
        int inputYear = 1800;

        boolean isLeapYear = LeapYear.checkLeapYear(inputYear);

        assertFalse(isLeapYear);
    }
}