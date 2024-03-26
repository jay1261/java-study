package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // data를 초기화해줌으로써 해결
        System.out.println("count = " + bigData.count); // 0
        System.out.println("data = " + bigData.data);

        System.out.println("value = " + bigData.data.value);
    }
}
