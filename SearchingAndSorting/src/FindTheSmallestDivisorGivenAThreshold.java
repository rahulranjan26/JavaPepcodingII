import java.util.Scanner;

public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        System.out.println("We will solve this question which is application of binary Search on answer and similar to " +
                "koko eating banana");
        int[] array = {3, 4, 6, 11, 16};
        Scanner scn = new Scanner(System.in);
        int hour = scn.nextInt();

        int max = Integer.MIN_VALUE;
        for (var v : array)
            max = Math.max(max, v);

        if (hour == array.length)
            System.out.println("Koko Should eat: " + max + " Number of banana per hour");

        int lo = 0;
        int hi = max;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isPossible(array, mid, hour)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(ans);

    }

    private static boolean isPossible(int[] array, int mid, int hour) {
        int time = 0;

        for (int i = 0; i < array.length; i++) {
            time += (int) Math.ceil(array[i] * 1.0 / mid);
        }
        return time <= hour;
    }
}
