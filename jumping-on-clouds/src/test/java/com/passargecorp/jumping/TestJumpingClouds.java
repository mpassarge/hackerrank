package com.passargecorp.jumping;

import org.junit.Assert;
import org.junit.Test;

public class TestJumpingClouds {

    @Test
    public void testJumpingOnClouds_example1() {

        int[] c = {0, 0, 1, 0, 0, 1, 0};

        // Solution {0,1,3,4,6}
        Assert.assertEquals(4, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_example2() {

        int[] c = {0, 0, 0, 0, 1, 0};

        // Solution {0,2,3,5}
        Assert.assertEquals(3, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_noClouds() {

        int[] c = {};

        // Solution {}
        Assert.assertEquals(0, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_oneJumpCloud() {

        int[] c = {0, 0};
        Assert.assertEquals(1, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_allNoGoClouds() {

        int[] c = {1, 1, 1, 1, 1};

        // Solution {}
        Assert.assertEquals(0, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_allJumpingClouds() {

        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Solution {0,2,4,6,8,10}
        Assert.assertEquals(5, JumpingClouds.jumpingOnClouds(c));
    }

    @Test
    public void testJumpingOnClouds_incompletePuzzel() {

        int[] c = {0, 1, 0, 0, 1, 1, 0};

        Assert.assertEquals(0, JumpingClouds.jumpingOnClouds(c));
    }
}
