package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endnum = 10;

        while(i <= endnum) {
            sum += i;
            System.out.println("i=" + i + " sum="+ sum);
            i++;
        }
    }
}
