import java.util.Arrays;

public class MakeLargestNumber {
    public static void main(String[] args) {
        System.out.println("We have numbers and we need to make the largest number using these numbers");
        int[] arr = {34, 3, 5, 9, 4, 8};
        String[] ans = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i] + "";
        }

        Arrays.sort(ans, (a, b) -> {
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            } else {
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = ans.length - 1; i >= 0; i--) {
            sb.append(ans[i]);
        }
        System.out.println(sb.toString());

    }
}
