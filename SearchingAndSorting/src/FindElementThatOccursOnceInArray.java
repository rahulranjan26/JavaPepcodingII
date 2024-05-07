public class FindElementThatOccursOnceInArray {
    public static void main(String[] args) {
        System.out.println("In array where every element occurs twice except one, find this " +
                "element that occurs once in the array" +
                "One appraoch is to use Xor but we have to solve this question in logarithmic time");
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        int lo = 0;
        int hi = arr.length - 1;
        int n = arr.length;
        if (n == 1) {
            System.out.println(arr[0]);
        } else if (arr[0] != arr[1]) {
            System.out.println(arr[0]);
        } else if (arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1]);

        }

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                System.out.println(arr[mid]);
                break;
            } else if (arr[mid] == arr[mid - 1]) {
                int lc = mid - lo + 1;
                if (lc % 2 == 0) {
                    lo = mid + 1;
                } else {
                    hi = mid - 2;
                }
            } else {
                int rc = hi - mid + 1;
                if (rc % 2 == 0) {
                    hi = mid - 1;
                } else {
                    lo = mid + 2;
                }
            }
        }
        System.out.println("Done");
    }
}
