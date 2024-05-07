public class CountNumberOfZeroes {
    public static void main(String[] args) {
        System.out.println("We will find the number of zeroes in sorted matrix");
        int[][] mat = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1}
        };
        int count = 0;
        int lo = 0;
        int hi = mat[0].length - 1;
        while (lo < mat.length && hi >= 0) {
            if (mat[lo][hi] == 1) {
                hi--;
            } else {
                count += hi + 1;
                lo++;
            }
        }
        System.out.println(count);
    }
}
