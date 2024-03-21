package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 클래스가 필요한 이유 2: 배열로 코드를 자동화했지만, 배열이 3개로 나누어져있다.
        // 데이터를 변경할 때 매우 조심해서 작업해야한다. 학생 1을 지우려면 각각의 배열에서 해당하는 인덱스의 값들을 정확하게 지워줘야함.
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};


        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
