public class RoofTop {
    public static void main(String[] args) {
        System.out.println("Find the maximum steps that a guy takes so that he keeps on gaining the height");
        int[] arr = {2, 3, 5, 8, 9, 2, 5, 6, 3, 8, 9, 10};
        int ans = 0;
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                c++;
            else {
                ans = Math.max(ans, c);
                c = 0;
            }
        }
        ans = Math.max(ans, c);
        System.out.println(ans);
    }
}
