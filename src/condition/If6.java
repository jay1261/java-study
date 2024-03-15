package condition;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // elsf if 를 쓰면 둘 중 하나만 실행됨
        if (price >= 10000) {
            discount += 1000;
            System.out.println("만원이상 구매 1000원 할인");
        }
        else if (age <= 10){
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }
        else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount +  "원");
    }
}


