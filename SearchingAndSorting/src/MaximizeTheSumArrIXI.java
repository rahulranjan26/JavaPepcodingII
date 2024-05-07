import java.util.Arrays;

public class MaximizeTheSumArrIXI {
    public static void main(String[] args) {
        System.out.println("we will find the sum that is maximum for " +
                "arr[i]*i");
        int[] arr = {5, 4, 8, 9, 6, 4, 1, 23, 4, 57, 8, 9, 5, 4, 6, 0, 5, -9};
        Arrays.sort(arr);
        int osum = 0;
        for (int i = 0; i < arr.length; i++) {
            osum += arr[i] * i;
        }
        System.out.println(osum);
    }
}
