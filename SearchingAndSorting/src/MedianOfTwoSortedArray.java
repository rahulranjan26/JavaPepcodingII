import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("We will find median of 2 sorted arrays here");
//        use n+m space and n+m tc --> Optimised approach is also
        int[] a = {2, 5, 8, 9, 10, 12, 14, 15};
        int[] b = {8, 9, 10, 12, 13, 15, 18, 19, 20, 21, 23};
        int[] ans = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        int n = ans.length;
        if (n % 2 == 0) {
            int mid = n / 2;
            System.out.println(((ans[mid] + ans[mid - 1]) / 2.0));
        } else {
            int mid = n / 2;
            System.out.println(ans[mid]);
        }
        System.out.println(Arrays.toString(ans));

    }

}
