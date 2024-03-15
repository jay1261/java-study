package loop.ex;

public class LoopEx5 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        int i = 1;
        for (i = 2; i<=5; i++){
            System.out.println(i);
        }
    }
}
