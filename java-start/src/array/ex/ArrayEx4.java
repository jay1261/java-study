package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    /*
        사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력세요");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + "번째 숫자: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("출력 결과");
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + ((double)sum/numbers.length));
    }
}
