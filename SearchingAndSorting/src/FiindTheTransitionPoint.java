import java.util.Arrays;

public class FiindTheTransitionPoint {
    public static void main(String[] args) {
        System.out.println("In an array of sorted integers of 0 and 1, find the transition point");
        int[] arr = {0,1};
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == 0) {
                lo = mid + 1;
            } else {
                ans = mid;
                hi = mid - 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        if (ans == -1) {
            System.out.println("No transition point");
        } else {
            System.out.println("Transition Point: " + ans);
        }
    }
}
