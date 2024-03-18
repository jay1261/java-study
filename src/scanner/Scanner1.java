package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next();
        System.out.println(str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); // 타입이 다르면 오류가 발생. -> 프로그램 종료
        System.out.println(intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println(doubleValue);
    }
}
