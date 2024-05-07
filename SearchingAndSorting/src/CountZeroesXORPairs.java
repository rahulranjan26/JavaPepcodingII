import java.util.HashMap;

public class CountZeroesXORPairs {
    public static void main(String[] args) {
        System.out.println("Count the number of xor pairs giving zeroes");
        int[] arr = {1, 7, 8, 4, 5, 1, 2, 1, 4, 5, 4, 4, 8, 9, 6, 4, 5, 4, 5, 4, 8, 4, 1, 5, 1, 2, 2, 3, 2, 5, 6, 4, 8,
                1, 2, 4, 4, 7, 8, 5, 4, 1,};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int count = 0;
        for (var val : map.keySet()) {
            int v = map.get(val);
            count += (v * (v - 1) / 2);
        }
        System.out.println(count);
    }
}
