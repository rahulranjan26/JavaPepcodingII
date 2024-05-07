import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        System.out.println("We will find the largest perimeter triangle");
        int[] arr = {2, 5, 47, 89, 6, 1, 2, 4, 7, 5, 6, 9, 8, 9, 5, 6, 4, 7, 8};
        Arrays.sort(arr);
        int ans = 0;

        for (int i = arr.length - 1; i >= 2; i--) {
            if (arr[i] < (arr[i - 1] + arr[i - 2])) {
                ans = arr[i] + arr[i - 1] + arr[i - 2];
                break;
            }

        }

        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
}
