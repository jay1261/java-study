package operator;

public class Logical2 {
    public static void main(String[] args) {
        // 논리 연산자 사용
        int a = 15;
        boolean result = a > 10 && a < 20;

        boolean result2 = 10 < a && a < 20; // 더 읽기 편함
        System.out.println(result);
    }
}
