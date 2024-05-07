import java.util.Scanner;

public class SplitArrayLragestSum {
    public static void main(String[] args) {
        System.out.println("this is leetcode 410 and same as allocate pages");
        System.out.println("we will work on the fact that we need to allocate minimum number of pages to each students" +
                "in such a way to lower the loading capacity");
        int[] arr = {7, 2, 5, 10, 8};
        Scanner scn = new Scanner(System.in);
        int studs = scn.nextInt();

        if (studs > arr.length)
            System.out.println("Not possible to allocate the pages");
        int ans = 0;
        int lo = 0;
        int hi = 0;
        for (var v : arr) {
            lo = Math.max(lo, v);
            hi += v;
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossibleToAllocate(arr, mid, studs)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isPossibleToAllocate(int[] arr, int mid, int studs) {
        int temp = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > mid) {
                temp++;
                sum = arr[i];
            }

        }

        return temp <= studs;
    }
}
