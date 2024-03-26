package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA.value);
        changePrimitive(dataA);
        System.out.println("dataA = " + dataA.value);
    }
    public static void changePrimitive(Data x){
        x.value = 20;
    }
}
