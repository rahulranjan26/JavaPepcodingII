import java.util.Scanner;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        System.out.println("We will learn about searching in 2D matrix" +
                "1. The rows are sorted left to right" +
                "2. The colum is sorted from top to bottom");
        int[][] matrix = {
                {1, 3, 4, 5},
                {2, 4, 8, 9},
                {5, 7, 9, 10},
                {7, 8, 12, 11}
        };

        int low = 0;
        int high = matrix[0].length-1;
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        boolean flag = false;
        while (low < matrix.length && high >= 0) {
            int val = matrix[low][high];
            if (val == target) {
                System.out.println("The target is at:" + low + " " + high);
                flag = true;
                break;
            } else if (val < target) {
                low = low + 1;

            } else {
                high = high - 1;
            }
        }

        if (!flag)
            System.out.println("Cant find");
    }


}
