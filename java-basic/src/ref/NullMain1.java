package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        System.out.println("data = " + data);
        // GC(가비지 컬렉터가) 자동으로 메모리에서 할당을 해제시킨다.
    }
}
