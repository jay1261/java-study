package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("count = " + bigData.count); // 0
        System.out.println("data = " + bigData.data); // null로 초기화

        System.out.println("value = " + bigData.data.value); // null.value를 한 것과 같으므로 NullPointerException발생
    }
}
