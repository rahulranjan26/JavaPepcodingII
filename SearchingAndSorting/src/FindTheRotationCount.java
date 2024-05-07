public class FindTheRotationCount {
    public static void main(String[] args) {
        System.out.println("We will find the minimum in rotated sorted array");
        int[] arr = {-4, -3, -2, -1, 0, 1, 2};
        int lo = 0;
        int hi = arr.length - 1;
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        if (arr[lo] <= arr[hi])
            System.out.println(0);
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
//            int prev = (mid + n - 1) % n;
//            int next = (mid + 1) % n;
            if ((mid - 1 > 0 && arr[mid] <= arr[mid-1]) && (mid + 1 < n && arr[mid] <= arr[mid+1])) {
                System.out.println(mid);
                break;
            } else if (arr[mid] <= arr[hi]) {
                hi = mid - 1;
            } else if (arr[mid] >= arr[lo])
                lo = mid + 1;

        }

    }
}
