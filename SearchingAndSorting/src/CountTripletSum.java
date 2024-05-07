import java.util.Arrays;

public class CountTripletSum {
    public static void main(String[] args) {
        System.out.println("Find 2 number whose sum is equal to third number in array  ");
        int[] array = {2, 7, 9, 6, 8, 4, 3, 1, 5, 10, 18, 16, 14, 17, 15, 22, 24, 28};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 2; i--) {
            int lo = 0;
            int hi = i - 1;

            while (lo < hi) {
                if (array[lo] + array[hi] == array[i]) {
                    System.out.println(array[lo] + " " + array[hi] + " " + array[i]);
                    lo++;
                    hi--;
                } else if (array[lo] + array[hi] < array[i]) {
                    lo++;
                } else
                    hi--;
            }
        }

    }
}
