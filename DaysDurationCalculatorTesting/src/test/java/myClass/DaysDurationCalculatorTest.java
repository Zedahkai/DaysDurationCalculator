package myClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DaysDurationCalculatorTest {
    // Month Tests

    @Test
    public void testCalMonth1LessThanMonth2() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 2, 1, 1), 31); // Month1 < Month2
    }

    @Test
    public void testCalMonthsEqual() {
        assertEquals(DaysDurationCalculator.cal(4, 1, 4, 1, 1), 0); // Month1 == Month2
    }

    // Day Tests
    @Test
    public void testCalDay1EqualsDay2() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 1, 1, 1), 0); // Day1 == Day2
    }

    @Test
    public void testCalDay1LessThanDay2() {
        assertEquals(DaysDurationCalculator.cal(1, 23, 1, 25, 1), 2); // Day1 < Day2
    }

    @Test
    public void testCalDay1GreaterThanDay2() {
        assertEquals(DaysDurationCalculator.cal(1, 31, 1, 1, 1), 30); // Day1 > Day2
    }


    // Year Tests

    @Test
    public void testCalNormalYear() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 12, 31, 1), 364);
    }
    
    @Test
    public void testCalNormalYear2() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 12, 31, 700), 364);
    }

    @Test
    public void testCalLeapYear() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 12, 31, 4), 365);
    }
    
    @Test
    public void testCalLeapYear2() {
        assertEquals(DaysDurationCalculator.cal(1, 1, 12, 31, 2016), 365);
    }
    
    @Test
    public void testCalFebNormalYear() {
        assertEquals(DaysDurationCalculator.cal(2, 1, 3, 1, 1), 28); // Normal February Days
        
    }
    
    @Test
    public void testCalFebLeapYear() {
        assertEquals(DaysDurationCalculator.cal(2, 1, 3, 1, 4), 29); // Leap Year February Days
    }
    
    // Mixed Tests
    
    @Test
    public void testCalMidMonths() {
        assertEquals(DaysDurationCalculator.cal(1, 15, 2, 15, 1), 31);
    }
    
    @Test
    public void testCalMidMonths2() {
        assertEquals(DaysDurationCalculator.cal(1, 5, 2, 20, 1), 46);
    }
    
    @Test
    public void testCalMidMonths3() {
        assertEquals(DaysDurationCalculator.cal(1, 30, 2, 1, 1), 2);
    }


}
