import java.util.Arrays;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
 
        int maxVal = 0;
        for (int x : uniqueNums) {
            maxVal = Math.max(maxVal, x);
        }
        int upperLimit = Integer.highestOneBit(maxVal) << 1;
        if (upperLimit == 0) upperLimit = 1;

        boolean[] s1 = new boolean[upperLimit];
        for (int a : uniqueNums) {
            for (int b : uniqueNums) {
                s1[a ^ b] = true;
            }
        }

        boolean[] s2 = new boolean[upperLimit];
        for (int ab = 0; ab < upperLimit; ab++) {
            if (s1[ab]) {
                for (int c : uniqueNums) {
                    s2[ab ^ c] = true;
                }
            }
        }

        int count = 0;
        for (boolean present : s2) {
            if (present) {
                count++;
            }
        }

        return count;
    }
}