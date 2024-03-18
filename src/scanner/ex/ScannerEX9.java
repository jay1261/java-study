package scanner.ex;

import java.util.Scanner;

public class ScannerEX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
/*
        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += input;
            count++;
        }
        */
        int input = 0;
        // 사용자 input을 바로 조건으로 넣어서 반복문 축약시키는 방법
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("합계 : " +  average);
        System.out.println("평균 값 : " +  average);
    }
}
