import java.util.Arrays;

public class CountTheNumberOfInversions {
    private static int count;

    public static void main(String[] args) {
        System.out.println("we will count the number of inversions");
        int[] array = {5, 4, 3, 2, 1};
        int lo = 0;
        int hi = array.length - 1;
        int[] ans = mergeSort(array, lo, hi);

        System.out.println(count);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] array, int lo, int hi) {
        if (lo == hi)
            return new int[]{array[lo]};
        int mid = (lo + hi) / 2;
        int[] left = mergeSort(array, lo, mid);
        int[] right = mergeSort(array, mid + 1, hi);

        return merge2SortedArray(left, right);

    }

    private static int[] merge2SortedArray(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
                k++;
            } else {
                count += (left.length - i);
                merged[k] = right[j];
                k++;
                j++;
            }

        }

        while (i < left.length) {
            merged[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            k++;
            j++;
        }

        return merged;
    }
}
