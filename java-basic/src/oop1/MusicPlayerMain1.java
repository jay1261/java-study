package oop1;

// 절차지향 프로그래밍
public class MusicPlayerMain1 {
    public static void main(String[] args) {

        int volumn = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);
        // 볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);
        // 볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 볼륨: " + volumn);
        // 음악 플레이어 상태
        if (isOn){
            System.out.println("음악 플레이어 ON" + ", 볼륨: " + volumn);
        } else {
            System.out.println("음악 플레이어 Off");
        }
        // 음악 플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        isOn = false;

    }
}
