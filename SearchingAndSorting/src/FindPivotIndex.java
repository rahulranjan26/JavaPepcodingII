public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println("We will find the pivot index" +
                "pivot index -> i -> sum(0...i-1)=sum(i+1....end)");
        int[] arr = {4, 3, -2, -5, 6, 0};
        int n = arr.length;
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int lsum = 0;
        int rsum = sum;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            rsum = rsum - arr[i];
            if (lsum == rsum) {
                flag = true;
                ans = i;
                break;
            }
            lsum += arr[i];
        }

        if (!flag)
            System.out.println("No pivot index");
        else
            System.out.println("Pivot Index:" + ans);
    }
}
