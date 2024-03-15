package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 5;
        for (int i = 1; i < endNum; i++){
            sum += i;
            System.out.println("i="+i+" sum=" + sum);
        }

        // for문은 조건부분을 비우고 사용 가능하다 (무한반복문이 된다)
//        for(;;){
//            System.out.println("");
//        }

        // (선언, 조건, 증감) 중에 조건만 비워도 될지 해봤는데 된다.
        for(int i = 0; ; i++){
            System.out.println("i =" + i);
        }
    }
}
