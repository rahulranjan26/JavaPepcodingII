import java.util.Scanner;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        System.out.println("We will find the algorithm to search an element in 2D sorted matrix");
//        The complexity is log(N*M)
        // * This is true only when the row are sorted from left to right and
        // * last element of previous row is smaller than the first element of next row.
        // * basically if you stretch the below matrix it will be sorted.
        //   Example -> 6<12 and 17<20 and 25<27
        // *
        int[][] matrix = {
                {1, 3, 4, 6},
                {12, 14, 16, 17},
                {20, 22, 23, 25},
                {27, 29, 30, 34}
        };
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int lo = 0;
        int hi = (matrix.length * matrix[0].length) - 1;
        int n = matrix.length;
        int m = matrix[0].length;
        boolean flag = false;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            int row = mid / n;
            int col = mid % m;
            if (matrix[row][col] == target) {
                System.out.println("Found the target at:" + row + " " + col);
                flag = true;
                break;
            } else if (matrix[row][col] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        if (!flag)
            System.out.println("Cant find the target");
    }
}
