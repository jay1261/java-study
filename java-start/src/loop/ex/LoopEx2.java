package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int num = 2;
        // while문 풀이
        while (num <= 10) {
            System.out.println(num);
            num += 2;
        }

        //for문 풀이
        System.out.println();
        for (int i =2; i<=10; i+=2){
            System.out.println(i);
        }
    }
}
