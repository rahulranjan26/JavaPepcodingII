import java.util.Arrays;
import java.util.Scanner;

public class FindPairsWithGivenDifference {
    public static void main(String[] args) {
        System.out.println("We will find a pair whose difference is equal to target");
        int[] arr = {4, 5, 7, 12, 54, 20, 30, 18, 17, 25, 34};
        Arrays.sort(arr);
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();

        int i = 0;
        int j = 1;
        boolean flag = false;
        while (i < arr.length - 1 && j < arr.length) {
            if (arr[j] - arr[i] == target) {
                System.out.println("The number are:" + " " + arr[j] + " " + arr[i]);
                flag = true;
                break;
            } else if (arr[j] - arr[i] < target) {
                j++;
            } else
                i++;
        }
        if (!flag)
            System.out.println("No such pair");
    }
}
