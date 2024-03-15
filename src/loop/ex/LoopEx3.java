package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int max = 3;
        int sum = 0;
        int i = 1;

        while (i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int j = 1; j <= max; j++) {
            sum2 += j;
        }
        System.out.println(sum2);
    }
}
