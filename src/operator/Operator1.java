package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5, b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println(sum);

        // 뺄셈
        int diff = a - b;
        System.out.println(diff);

        //곱셈
        int multi = a * b;
        System.out.println(multi);

        // 나눗셈 (int는 몫만)
        int div = a / b; // 2.5 -> 2 로 나옴
        double divDouble = (double)a / (double)b;
        System.out.println(div);
        System.out.println(divDouble);

        // 나머지
        int mod = a % b;
        System.out.println(mod);
    }
}
