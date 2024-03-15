package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Continue1 {
    public static void main(String[] args) {
        // continue 아래의 코드를 실행시키지 않고 넘어가기
        int i = 1;

        while (i <= 5) {
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        System.out.println("---------");
        int[] test = {1,2,3,4,5};

        IntStream t = Arrays.stream(test).map(x -> x + 1);
        t.forEach(x -> System.out.println(x));

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.forEach(x -> System.out.println(x));
    }
}
