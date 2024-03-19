package array;

public class Foreach1 {
    public static void main(String[] args) {
        // 향상된 for 문 , for-each문
        int[] nums = {1, 2, 3, 4, 5, 6};

        for (int num : nums) {
            System.out.println(num);
        }

        // for-each를 사용할 수 없는 경우 : 증가하는 index의 값이 필요할 때

    }
}
