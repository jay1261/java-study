package scanner.ex;

import java.util.Scanner;

public class ScannerEX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println(num + "단의 구구단");
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
