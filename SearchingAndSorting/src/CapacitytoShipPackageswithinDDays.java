import java.util.Scanner;

public class CapacitytoShipPackageswithinDDays {
    public static void main(String[] args) {
        System.out.println("this is leetcode 410 and same as allocate pages");
        System.out.println("Same as Allocate pages and it is leetcode 1011");
        int[] arr = {2, 3, 4, 1, 5, 6, 7, 9, 8, 10};
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
