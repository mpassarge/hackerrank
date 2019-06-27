package com.passargecorp.sockmerchant;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.Validate;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        Validate.notNull(ar);

        Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < n; i++) {
            counts.put(ar[i], counts.getOrDefault(ar[i], 0) + 1);
        }
        return counts.keySet()
                     .stream()
                     .mapToInt(key -> findPairs(counts.get(key)))
                     .sum();
    }

    static int findPairs(int numberOfIndividualSocks) {

        return numberOfIndividualSocks / 2;
    }
}
