public class SunFacingBuilding {
    public static void main(String[] args) {
        System.out.println("We will count the number of building that faces the " +
                "sun");

        int[] arr = {4, 8, 9, 4, 6, 3, 14, 25, 10, 58};
        int max = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
