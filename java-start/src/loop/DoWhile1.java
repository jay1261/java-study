package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        // do while - 조건에 상관없이 처음 1번은 실행
        int i = 10;
        do{
            System.out.println("현재 숫자는 " + i);
        } while (i < 3);
    }
}
