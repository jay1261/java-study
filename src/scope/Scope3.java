package scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            // temp는 if문 안에서만 사용되는 코드인데 위에서 선언하게 되면 사용하지도 않는 구간에서 메모리 낭비가 일어남
            // 코드 복잡성 증가
            System.out.println("temp = " + temp);
        }
        System.out.println(m);
    }
}
