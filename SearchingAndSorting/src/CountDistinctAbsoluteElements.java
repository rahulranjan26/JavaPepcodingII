import java.util.Arrays;

public class CountDistinctAbsoluteElements {
    public static void main(String[] args) {
        System.out.println("We will work on finding the number of absolute distinct elements in sorted array");
        int[] arr = {5, 1, 4, 7, -8, -5, 2, -9, -2, -1, -6, -4, 9};
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        int prev = Integer.MAX_VALUE;
        int next = Integer.MAX_VALUE;
        int count = 0;

        while (lo <= hi) {
            if (Math.abs(arr[lo]) == Math.abs(arr[hi])) {
                if (arr[lo] != prev && arr[hi] != next) {
                    prev = arr[lo];
                    next = arr[hi];
                    count++;
                    lo++;
                    hi--;
                }
            } else if (Math.abs(arr[lo]) < Math.abs(arr[hi])) {
                if (arr[hi] != next) {
                    count++;
                }
                next = arr[hi];
                hi--;

            } else {
                if (arr[lo] != prev) {
                    count++;
                }
                prev = arr[lo];
                lo++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
