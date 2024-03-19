package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    /*
        문제 - 2차원 배열1
        사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
        2차원 배열을 사용.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.print((i+1) + "번 학생의 ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: " + scores[i][j] + " ");
                sum += scores[i][j];
            }
            System.out.println();
            System.out.println((i+1) + "번 학생의 총점: " + sum);
            System.out.println((i+1) + "번 학생의 평균: " + ((double) sum/ scores[i].length));
        }
    }
}
