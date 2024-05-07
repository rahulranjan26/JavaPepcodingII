import java.util.Arrays;

public class CountNumberOfTriangels {
    public static void main(String[] args) {
        System.out.println("Find number of triangles   ");
        int[] array = {2, 7, 9, 6, 8, 4, 3, 1, 5, 10, 18, 14, 17, 15, 22, 24, 28};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count=0;

        for (int i = array.length - 1; i >= 2; i--) {
            int lo = 0;
            int hi = i - 1;

            while (lo < hi) {
                if (array[lo] + array[hi] > array[i]) {
                    count+=(hi-lo);
                    hi--;

                } else
                    lo++;
            }
        }
        System.out.println(count);
    }
}
