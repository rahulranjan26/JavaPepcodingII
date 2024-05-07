import java.util.Arrays;

public class MarksOfPCM {
    private static class Marks implements Comparable<Marks> {
        int phy;
        int chem;
        int bio;

        public Marks(int phy, int chem, int bio) {
            this.phy = phy;
            this.chem = chem;
            this.bio = bio;
        }


        @Override
        public int compareTo(Marks o) {
            if (this.phy != o.phy)
                return this.phy - o.phy;
            else if (this.chem != o.chem) {
                return this.chem - o.chem;
            } else
                return this.bio - o.bio;
        }
    }

    public static void main(String[] args) {
        System.out.println("We will find the sorted marks of students");
        int[] phy = {2, 9, 1, 5, 4, 9, 6, 5, 2, 3, 1, 5};
        int[] chem = {5, 9, 6, 4, 5, 6, 3, 2, 1, 4, 7, 8};
        int[] bio = {5, 9, 6, 4, 2, 3, 1, 4, 5, 7, 8, 9};

        Marks[] marks = new Marks[phy.length];
        for (int i = 0; i < phy.length; i++) {
            marks[i] = new Marks(phy[i], chem[i], bio[i]);
        }
        Arrays.sort(marks);
        for (var m : marks) {
            System.out.println(m.phy + " " + m.chem + " " + m.bio);
        }
    }
}
