package com.passargecorp.countingvalleys;

public class CountingValleys {

    static int countingValleys(int n, String s) {

        boolean belowSeaLevel = false;
        int height = 0;
        int valleyCount = 0;

        for(char c : s.toCharArray()) {

            height += upOrDown(c);

            // Coming back to sea level from below sea level
            // Means coming out of Valley
            if(belowSeaLevel && height >= 0) {
                valleyCount++;
                belowSeaLevel = false;
            }

            if(height < 0) {
                belowSeaLevel = true;
            }
        }
        return valleyCount;
    }

    // Returns +/- whether character is U(Up/+1) or D(Down/-1)
    // Used to find the level in the hike
    static int upOrDown(char c) {

        if(c == 'U') {
            return 1;
        } else if(c == 'D') {
            return -1;
        }
        return 0;
    }
}
