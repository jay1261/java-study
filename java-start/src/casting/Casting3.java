package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue); // int의 범위 안이라서 문제 없음

        intValue = (int)maxIntOver;
        System.out.println(intValue); // -2147483648 출력됨 오버플로우 발생
        // 보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것처럼 다시 처음부터 시작한다.
        // int의 경우 표현할 수 있는 가장 작은 숫자인 -2147483648부터 시작.
    }
}
