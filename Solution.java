/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int length = nums.length;
        int[] sorted = new int[length];
        System.arraycopy(nums, 0, sorted, 0, length);
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < length; i++) {
            map.put(sorted[i], i);
        }

        int[] smaller = new int[length];

        for (int i = 0; i < length; i++) {
            // get second integer which is the index in sorted array
            smaller[i] = map.get(nums[i]);
        }

        return smaller;
    }

}
