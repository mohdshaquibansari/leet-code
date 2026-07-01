class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;

        long N = (long)n * n;

        long expectedSum = N * (N + 1) / 2;
        long expectedSquare = N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSquare = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSquare += (long)num * num;
            }
        }

        long diff = actualSum - expectedSum;          // A-B

        long squareDiff = actualSquare - expectedSquare; // A²-B²

        long sum = squareDiff / diff;                 // A+B

        int repeated = (int)((diff + sum) / 2);

        int missing = (int)(sum - repeated);

        return new int[]{repeated, missing};
    }
}