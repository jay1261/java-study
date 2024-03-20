 package method;
public class Method6 {
    public static void main(String[] args) {
        double num = 1.5;
//        printNumber(num); // 타입이 달라서 오류
        printNumber((int) num); // 명시적 형변환

        int num2 = 1;
        printDouble(num2); // 자동 형변환 적용됨 int->double
    }

    public static void printNumber(int num) {
        System.out.println(num);
    }

    public static void printDouble(double num) {
        System.out.println(num);
    }
}
