package com.passargecorp.jumping;

import org.junit.Assert;
import org.junit.Test;

public class TestJumpingClouds {

    @Test
    public void testJumpingOnClouds_example1() {

        int[] c = {0, 0, 1, 0, 0, 1, 0};

        Assert.assertEquals(4, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_example2() {

        int[] c = {0, 0, 0, 0, 1, 0};

        Assert.assertEquals(3, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_noClouds() {

        int[] c = {};

        Assert.assertEquals(0, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_allNoGoClouds() {

        int[] c = {1, 1, 1, 1, 1};

        Assert.assertEquals(0, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_allJumpingClouds() {

        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertEquals(5, JumpingClouds.jumpingOnClouds(c));
    }
}
