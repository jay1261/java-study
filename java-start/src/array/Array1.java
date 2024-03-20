package array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 50;
        students[4] = 60;

        for (int i = 0; i < Arrays.stream(students).count(); i++) {
            System.out.println(students[i]);
        }
    }
}
