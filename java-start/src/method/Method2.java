package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        boolean isOdd = odd(10);
        System.out.println(isOdd);
    }
    // 반환 타입이 없는 메서드
    public static void printHeader(){
        System.out.println("== 프로그램을 시작합니다 ==");
    }

    // 반환타입이 있는 메서드
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
