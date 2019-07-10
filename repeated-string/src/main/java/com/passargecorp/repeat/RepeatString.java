package com.passargecorp.repeat;

public class RepeatString {

    static long repeatedString(String s, long n) {

        long total = 0;

        long aCount = s.chars()
                       .filter(c -> c == 'a')
                       .count();

        int lengthOfString = s.length();

        long numberOfFullRepetedStrings = n / lengthOfString;
        long remainder = n % lengthOfString;


        total += numberOfFullRepetedStrings * aCount;

        String remainingRepeat = s.substring(0, (int) remainder);

        total += remainingRepeat.chars()
                                .filter(c -> c == 'a')
                                .count();

        return total;
    }
}
