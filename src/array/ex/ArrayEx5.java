package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    /*
        이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        System.out.println(num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수의 합계 : " + Arrays.stream(numbers).sum());
        System.out.println("입력한 정수의 평균 : " + (Arrays.stream(numbers).sum() / (double) numbers.length) );
    }
}
