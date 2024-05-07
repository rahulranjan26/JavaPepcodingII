public class MaxSumInTheConfiguration {
    public static void main(String[] args) {
        System.out.println("We will find the arr[i]*i but this time u can only rotate the array ");
        int[] arr = {3,1,2,4,5};
        int sum = 0;
        int si = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            si+=arr[i]*i;
        }
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i <n-1 ; i++) {
           int sp = si+sum - n*arr[n-i-1];
           ans = Math.max(sp,ans);
           si = sp;
        }
        System.out.println(ans);
    }
}
