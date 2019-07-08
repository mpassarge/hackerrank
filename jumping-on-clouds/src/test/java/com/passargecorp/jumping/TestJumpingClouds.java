package com.passargecorp.jumping;

import org.junit.Assert;
import org.junit.Test;

public class TestJumpingClouds {

    @Test
    public void testJumpingOnClouds_1() {

        int[] c = {0, 0, 1, 0, 0, 1, 0};

        Assert.assertEquals(4, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_2() {

        int[] c = {0, 0, 0, 0, 1, 0};

        Assert.assertEquals(3, JumpingClouds.jumpingOnClouds(c));
    }
}
