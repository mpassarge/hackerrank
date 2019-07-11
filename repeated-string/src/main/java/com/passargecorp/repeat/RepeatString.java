package com.passargecorp.repeat;

public class RepeatString {

    static long repeatedString(String s, long n) {

        // Assume s.length() != 0 and s != null

        long total = 0;
        long aCount = numberOfAs(s);

        // Handle special case to short circuit
        if(aCount == 0) {
            return 0;
        }

        int lengthOfString = s.length();

        long numberOfRepeatsOfFullString = n / lengthOfString;
        long remainder = n % lengthOfString;

        total += numberOfRepeatsOfFullString * aCount;

        // Not count remainder if not needed
        if(remainder != 0) {
            total += numberOfAs(s.substring(0, (int) remainder));
        }

        return total;
    }

    static long numberOfAs(final String s) {

        return s.chars()
                .filter(c -> c == 'a')
                .count();
    }
}
