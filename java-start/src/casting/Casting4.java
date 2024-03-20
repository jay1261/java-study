package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println(div1); // 1

        double div2 = 3 / 2;
        System.out.println(div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println(div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println(div4); // 1.5

        double div5 = 3 / 2.0;
        System.out.println(div5); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result);

        // 자바에서 다른 타입의 계산은 큰범위로 자동 형변환이 일어난다.
        // 같은 타입의 계산은 같은 타입의 결과를 낸다.
    }
}
