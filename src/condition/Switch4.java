package condition;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;

        // 자바 14 부터 나온 새로운 switch
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->500;
        };

        System.out.println("발급 쿠폰 " + coupon);

        switch(grade){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("default");
        }
    }
}
