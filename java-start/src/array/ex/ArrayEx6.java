package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    /*
    문제 - 가장 작은 수, 큰 수 찾기
    사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로 그램을 작성하자.
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
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
