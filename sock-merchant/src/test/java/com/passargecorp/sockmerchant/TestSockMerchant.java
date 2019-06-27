package com.passargecorp.sockmerchant;

import static com.passargecorp.sockmerchant.SockMerchant.sockMerchant;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSockMerchant {

    @Test
    public void testSockMerchant() {

        final int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        final int n = ar.length;

        assertEquals(4, sockMerchant(n, ar));
    }

    @Test
    public void testSockMerchant_singlePair() {

        final int[] ar = {1, 1};
        final int n = ar.length;

        assertEquals(1, sockMerchant(n, ar));
    }

    @Test
    public void testSockMerchant_singleSock() {

        final int[] ar = {1};
        final int n = ar.length;

        assertEquals(0, sockMerchant(n, ar));
    }

    @Test
    public void testSockMerchant_zeroElements() {

        assertEquals(0, sockMerchant(0, new int[]{}));
    }

    @Test
    public void testSockMerchant_zeroPairs() {

        final int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int n = ar.length;

        assertEquals(0, sockMerchant(n, ar));
    }
}
