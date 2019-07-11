package com.passargecorp.repeat;

import org.junit.Assert;
import org.junit.Test;

public class TestRepeatString {

    @Test
    public void testRepeatString_example1() {

        String s = "aba";
        long n = 10L;
        Assert.assertEquals(7, RepeatString.repeatedString(s, n));
    }

    @Test
    public void testRepeatString_example2() {

        String s = "a";
        long n = 1000000000000L;

        Assert.assertEquals(1000000000000L, RepeatString.repeatedString(s, n));
    }

    @Test
    public void testRepeatString_firstCharacter() {

        String s = "aba";
        long n = 1L;

        Assert.assertEquals(1L, RepeatString.repeatedString(s, n));
    }

    @Test
    public void testRepeatString_zeroOccurrences() {

        String s = "bcd";
        long n = 1000000000000L;

        Assert.assertEquals(0L, RepeatString.repeatedString(s, n));
    }
}
