import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Search in a rotated sorted array for non duplicate items");
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int lo = 0;
        int hi = arr.length - 1;
        boolean flag = false;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                System.out.println("Target is at: " + mid);
                flag = true;
                break;
            } else if (arr[lo] <= arr[mid]) {
                // lo to mid is sorted
                if (target >= arr[lo] && arr[mid] > target)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else if (arr[mid] <= arr[hi]) {
                //mid to hi is sorted
                if (target > arr[mid] && target <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        if (!flag)
            System.out.println("Target is not present ");
    }
}
