package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello"); // 문자열은 == 를 사용하면 안되는 경우가 존재함. 따라서 equals를 사용
    }
}
