import java.util.*;

public class FindKClosestElements {
    public static void main(String[] args) {
        System.out.println("we will find the k closest element" +
                "Closest element --> |x-a|<|x-b| then a is closer than b to X");
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {5, 6, 7, 4, 6, 3};
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int k = scn.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (i < k)
                pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
            else {

                if (pq.peek() != null && pq.peek().gap > Math.abs(arr[i] - x)) {
                    pq.remove();
                    pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
                } else if (pq.peek() != null && pq.peek().gap == Math.abs(arr[i] - x) && pq.peek().val > arr[i]) {
                    pq.remove();
                    pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
                }
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.remove().val);
        }
        Collections.sort(ans);
        System.out.println(ans);
        ArrayList<Integer> ans_2 = optimisedApproach(arr, k, x);
        System.out.println(ans_2);

    }

    private static class Pair implements Comparable<Pair> {
        int val;
        int gap;

        Pair(int val, int gap) {
            this.val = val;
            this.gap = gap;
        }

        public int compareTo(Pair o) {
            if (this.gap == o.gap)
                return this.val - o.val;
            else
                return this.gap - o.gap;
        }
    }

    private static ArrayList<Integer> optimisedApproach(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arr[mid] == x) {
                break;
            } else if (arr[mid] > k) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        lo = mid - 1;
        hi = mid;

        while (lo >= 0 && hi < arr.length && k > 0) {
            if (Math.abs(arr[lo] - x) <= Math.abs(arr[hi] - x)) {
                ans.add(arr[lo]);
                lo--;
            } else {
                ans.add(arr[hi]);
                hi++;
            }
            k--;
        }

        while (k > 0 && lo >= 0) {
            ans.add(arr[lo]);
            lo--;
            k--;
        }

        while (k > 0 && hi <= arr.length) {
            ans.add(arr[hi]);
            hi++;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}
