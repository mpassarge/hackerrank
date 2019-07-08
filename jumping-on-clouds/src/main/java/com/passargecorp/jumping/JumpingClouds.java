package com.passargecorp.jumping;

import java.util.ArrayList;
import java.util.List;

public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {

        if(c.length == 0 || !canStartAndFinish(c)) {

            return 0;
        }
        return findOptomizedSolution(c);
    }

    static boolean canStartAndFinish(int[] c) {

        return c.length > 1 && c[0] == 0 && c[c.length - 1] == 0;
    }

    static int findOptomizedSolution(int[] c) {

        List<Integer> solution = new ArrayList<>();
        solution.add(0);

        for(int i = 1; i < c.length - 2; i++) {
            if(c[(i + 1)] == 0) {
                solution.add(i + 1);
                i++;
            } else if(c[i] == 0) {
                solution.add(i);
            } else {
                return 0;
            }
        }
        solution.add(c.length - 1);

        return solution.size() - 1;
    }
}
