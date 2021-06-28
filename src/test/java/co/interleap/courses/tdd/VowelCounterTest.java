package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
  @Test
    public void testCounterZero(){
        assertEquals(0,new VowelCounter().countVowels(""));
    }

    @Test
    public void testCounterSingleVowel(){
        assertEquals(1,new VowelCounter().countVowels("a"));
    }


    @Test
    public void testCounterSingleConsonant(){
        assertEquals(0,new VowelCounter().countVowels("b"));
    }

    @Test
    public void testCounterMultipleVowel(){
        assertEquals(4,new VowelCounter().countVowels("aeio"));
    }

    @Test
    public void testCounterVowelAndConsonant(){
        assertEquals(3,new VowelCounter().countVowels("ABCDEFGHIJK"));
    }










}