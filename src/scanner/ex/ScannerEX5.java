package scanner.ex;

import java.util.Scanner;

public class ScannerEX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 a를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("숫자 b를 입력하세요 : ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
