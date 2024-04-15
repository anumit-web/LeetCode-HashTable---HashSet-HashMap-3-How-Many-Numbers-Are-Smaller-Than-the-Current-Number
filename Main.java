/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("How Many Numbers Are Smaller Than the Current Number");
        System.out.println("Solving problems using hashmap");
        System.out.println("");

        Solution solution = new Solution();

        int[] nums1 = {8,1,2,2,3};        
        int[] smaller_array1 = solution.smallerNumbersThanCurrent(nums1);

        System.out.println("Output , Numbers Are Smaller Than the Current Number  = " + Arrays.toString(smaller_array1)); 


    }

}
