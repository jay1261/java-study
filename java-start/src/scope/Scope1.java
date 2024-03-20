package scope;


public class Scope1 {
    // 지역번수
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true){
            int x = 20; // x 생존 시작
            System.out.println(m);
            System.out.println(x);
        }// x 생존 종료

        // System.out.println(x); // 컴파일 오류
        System.out.println(m);
    }// m 생존 종료
}
