import java.util.ArrayList;

public class UnionOfTwoSortedSets {
    public static void main(String[] args) {
        System.out.println("We will work on finding the union of 2 sets which are sorted");
        int[] set1 = {1, 1, 1, 2, 5, 5, 5, 5, 9, 9, 10, 12, 14, 14, 18, 19};
        int[] set2 = {1, 2, 5, 5, 10, 10, 10, 11, 14, 19, 19};

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < set1.length && j < set2.length) {
            if (set1[i] == set2[j]) {
                if (!ans.isEmpty() && ans.get(ans.size() - 1) != set1[i]) {
                    ans.add(set1[i]);
                } else if (ans.isEmpty()) {
                    ans.add(set1[i]);
                }
                i++;
                j++;
            } else if (set1[i] < set2[j]) {
                if (!ans.isEmpty() && ans.get(ans.size() - 1) != set1[i]) {
                    ans.add(set1[i]);
                } else if (ans.isEmpty()) {
                    ans.add(set1[i]);
                }
                i++;
            } else {
                if (!ans.isEmpty() && ans.get(ans.size() - 1) != set2[j]) {
                    ans.add(set2[j]);
                } else if (ans.isEmpty()) {
                    ans.add(set2[j]);
                }
                j++;
            }
        }

        while (i < set1.length) {
            if (!ans.isEmpty() && ans.get(ans.size() - 1) != set1[i]) {
                ans.add(set1[i]);
            } else if (ans.isEmpty()) {
                ans.add(set1[i]);
            }
            i++;
        }
        while (j < set2.length) {
            if (!ans.isEmpty() && ans.get(ans.size() - 1) != set2[j]) {
                ans.add(set2[j]);
            } else if (ans.isEmpty()) {
                ans.add(set2[j]);
            }
            j++;
        }

        System.out.println(ans);

    }
}
