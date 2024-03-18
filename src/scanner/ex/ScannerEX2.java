package scanner.ex;

import java.util.Scanner;

public class ScannerEX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        System.out.println("입력한 숫자 " + num + (num % 2 == 0 ? "는 짝수 입니다." : "는 홀수 입니다."));

    }
}
