import org.junit.Test;

import static junit.framework.TestCase.*;

public class WarmUpTest {


    @Test
    public void isPrimeTest() {
        assertTrue(WarmUp.isPrime(2));
        assertTrue(WarmUp.isPrime(3));
        assertTrue(WarmUp.isPrime(5));
        assertTrue(WarmUp.isPrime(7));
        assertTrue(WarmUp.isPrime(11));
        assertTrue(WarmUp.isPrime(13));
        assertTrue(WarmUp.isPrime(17));
        assertTrue(WarmUp.isPrime(19));
        assertTrue(WarmUp.isPrime(23));
        assertTrue(WarmUp.isPrime(29));

    }

    @Test
    public void isNotPrimeTest() {
        assertFalse(WarmUp.isPrime(1));
        assertFalse(WarmUp.isPrime(4));
        assertFalse(WarmUp.isPrime(6));
        assertFalse(WarmUp.isPrime(8));
        assertFalse(WarmUp.isPrime(9));
        assertFalse(WarmUp.isPrime(10));
        assertFalse(WarmUp.isPrime(12));
        assertFalse(WarmUp.isPrime(14));
        assertFalse(WarmUp.isPrime(15));
        assertFalse(WarmUp.isPrime(16));
        assertFalse(WarmUp.isPrime(18));

        //Negative eingaben

        assertFalse(WarmUp.isPrime(-2));
        assertFalse(WarmUp.isPrime(-5));
        assertFalse(WarmUp.isPrime(-13));

        //Testfälle für 0 und 1

        assertFalse(WarmUp.isPrime(0));
        assertFalse(WarmUp.isPrime(1));
    }

    @Test
    public void getDigitSumTest() {
        assertEquals(6, WarmUp.getDigitSum(123));
        assertEquals(5, WarmUp.getDigitSum(41));
        assertEquals(1, WarmUp.getDigitSum(100000));
        assertEquals(15, WarmUp.getDigitSum(12345));
        assertEquals(0, WarmUp.getDigitSum(0));
    }


}
