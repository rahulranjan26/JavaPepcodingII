import java.util.Arrays;

public class ShouldStudentBePunished {
    public static void main(String[] args) {
        System.out.println("We will find if the student are punished or not");
        int[] array = {9, 3, 4, 6, 7, 5, 2, 1};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
