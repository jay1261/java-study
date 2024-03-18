package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 작은 범위에서 큰 범위에 값을 대입하는 것은 허용
        // 자동 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println(longValue);

        doubleValue = intValue; // int -> double
        System.out.println(doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println(doubleValue);
    }
}
