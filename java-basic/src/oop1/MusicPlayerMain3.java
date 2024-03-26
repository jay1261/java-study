package oop1;

// 절차지향 프로그래밍 - 데이터 묶음, 메서드로 모듈화
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();
    }
}
