package com.passargecorp.countingvalleys;

import org.junit.Assert;
import org.junit.Test;

public class TestCountingValleys {

    /*
        _/\      _
           \    /
            \/\/

    */
    @Test
    public void testCountingValleys() {

        String s = "UDDDUDUU";
        int n = s.length();

        Assert.assertEquals(1, CountingValleys.countingValleys(n, s));
    }

    /*
            /\
        _/\/  \    /\    _
               \  /  \  /
                \/    \/
    */
    @Test
    public void testCountingValleys_multipleValleys() {

        String s = "UDUUDDDDUUUDDDUU";
        int n = s.length();

        Assert.assertEquals(2, CountingValleys.countingValleys(n, s));
    }

    /*
      _
       \  _
        \/
    */
    @Test
    public void testCountingValleys_noValleys() {

        String s = "DDU";
        int n = s.length();

        Assert.assertEquals(0, CountingValleys.countingValleys(n, s));
    }
}
