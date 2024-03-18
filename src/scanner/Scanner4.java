package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 :");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 :");
        int num2 = scanner.nextInt();

        String result = num1 == num2 ? "같음" : (num1 > num2 ? num1 + "가 더 큽니다." : num2 + "가 더 큽니다." );
        System.out.println(result);
    }
}
