package variable;

public class Var8 {
    public static void main(String[] args) {
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; // 제일 큰 정수

        float f = 10.0f; // 소수점 계산에 오류가 많기 때문에 실무에서 사용을 많이 안함
        double d = 10.0; // float보다 표현 범위가 넓음
    }
}
