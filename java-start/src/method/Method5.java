 package method;
public class Method5 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); // 출력: 5
        num1 = changeNumber(num1); // 함수 return을 num1에 대입
        System.out.println("changeNumber 호출 후, num1: " + num1); // 출력: 10
    }
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
