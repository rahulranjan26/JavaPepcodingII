import java.util.Arrays;

public class CountElementsInTwoArray {
    public static void main(String[] args) {
        System.out.println("We will make sure to find number of elements smaller or equal to given element in another " +
                "array");
        int[] arr1 = {4, 8, 3, 1, 7, 9, 6, 5, 2};
        int[] arr2 = {4, 8, 6, 1, 2, 4, 7, 8, 5, 4, 5, 6, 6, 9, 7, 8, 4, 5, 6, 2, 1, 5, 4, 7, 8, 9, 6, 5, 2, 3, 4};
        Arrays.sort(arr2);
        int[] ans = new int[arr1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = countSmallerOrEqual(arr2, arr1[i]);
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(countSmallerOrEqual2(arr1, arr2)));

    }

    public static int countSmallerOrEqual(int[] arr, int key) {
        int count = 0;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= key) {
                count += (mid - lo + 1);
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return count;
    }

    public static int[] countSmallerOrEqual2(int[] arr1, int[] arr2) {
        int[] freq = new int[Arrays.stream(arr1).max().getAsInt() + 1];
        int[] prefixSum = new int[freq.length + 1];
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            freq[arr2[i]] = freq[arr2[i]] + 1;
        }
        for (int i = 1; i < freq.length; i++) {

            prefixSum[i] = prefixSum[i - 1] + freq[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = prefixSum[arr1[i]];
        }
        return ans;
    }
}
