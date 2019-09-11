package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldReturnIfor1() {
        assertEquals("I", RomanConverter.toRoman(1));
    }
    @Test
    void shouldReturnIIfor2() {
        assertEquals("II", RomanConverter.toRoman(2));
    }
    @Test
    void shouldReturnIIIfor3() {
        assertEquals("III", RomanConverter.toRoman(3));
    }
    @Test
    void shouldReturnIVfor4() {
        assertEquals("IV", RomanConverter.toRoman(4));
    }
    @Test
    void shouldReturnVfor5() {
        assertEquals("V", RomanConverter.toRoman(5));
    }
    @Test
    void shouldCalculate6trough9() {
        assertEquals("VI", RomanConverter.toRoman(6));
        assertEquals("VII", RomanConverter.toRoman(7));
        assertEquals("VIII", RomanConverter.toRoman(8));
    }
    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", RomanConverter.toRoman(9));
    }
    @Test
    void shouldCalculateNumbersover10() {
        assertEquals("X", RomanConverter.toRoman(10));
        assertEquals("XV", RomanConverter.toRoman(15));
    }

    @Test
    void ShouldCalculateMultipleofTens() {
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }

}

