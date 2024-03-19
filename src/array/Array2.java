package array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
//        int[] students;
//        students = new int[]{90, 80, 70, 60, 50};
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < Arrays.stream(students).count(); i++) {
            System.out.println(students[i]);
        }
    }
}
