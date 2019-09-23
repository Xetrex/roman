package no.kristiania.roman;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanConverterTest {

    @Test
    public void shouldReturnIXFor9(){

        assertEquals("IX", RomanConverter.toRoman(9));
}

    @Test
    public void shoudlCalculateNumbersOver10(){
        assertEquals("X", RomanConverter.toRoman(10));
        assertEquals("XVIII", RomanConverter.toRoman(18));
    }

    @Test
    public void shouldCalculateMultiplesOf10(){
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }

    @Test
    public void shouldCalculateSimpleDigits(){
        assertEquals("MMMDCCCLXXXVIII", RomanConverter.toRoman(3888));
    }

    @Test
    public void shouldCalculateFourLikeDigits(){
        assertEquals("CDXLIV", RomanConverter.toRoman(444));
    }

    @Test
    public void shouldCalculateNineLikeDigits(){
        assertEquals("CMXCIX", RomanConverter.toRoman(999));
    }
}
