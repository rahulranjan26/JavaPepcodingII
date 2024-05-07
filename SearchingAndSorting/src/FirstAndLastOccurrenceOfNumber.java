import java.util.Scanner;

public class FirstAndLastOccurrenceOfNumber {
    public static void main(String[] args) {
        System.out.println("Find the first and last occurrence in a sorted array ");
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 7, 8, 8, 9};
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int first = -1;
        int last = -1;

        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                first = mid;
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }

        lo = 0;
        hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                last = mid;
                lo = mid + 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }
        System.out.println("First Index:" + " " + first + " Last Index" + " " + last);

    }
}
