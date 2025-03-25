package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 음악 플레이어 켜기
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);

        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);

        // 볼륨 감소
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인 ");
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼류 :" + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 ㄱ끄기
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }

}
