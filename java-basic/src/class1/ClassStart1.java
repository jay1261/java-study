package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        // 클래스가 필요한 이유
        // 각각 학생들을 추가 할 때마다 작성해야하는 코드의 양이 엄청 많아진다.
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);
    }
}
