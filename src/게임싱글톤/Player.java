package 게임싱글톤;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    // 설정 변경
    public void changeSettings(String res, int vol, String diff) {
        GameSetting settings = GameSetting.getInstance();
        settings.setResolution(res);
        settings.setVolume(vol);
        settings.setDifficulty(diff);
        System.out.println(name + " -> 게임 설정 완료!!!");
    }

    // 현재 설정 확인
    public void printSettings() {
        GameSetting settings = GameSetting.getInstance();
        System.out.println("해상도 : " + settings.getResolution());
        System.out.println("볼륨 :  " + settings.getVolume());
        System.out.println("난이도 : " + settings.getDifficulty());
    }

}
