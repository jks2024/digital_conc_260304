package 게임싱글톤;

public class GameSetting {
    private String resolution;
    private int volume;
    private String difficulty;
    private static GameSetting gameSetting = new GameSetting();
    private GameSetting() {
        resolution = "1920x1080";
        volume = 50;
        difficulty = "Normal";
    }
    public static GameSetting getInstance() {
        return gameSetting;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getResolution() {
        return resolution;
    }

    public int getVolume() {
        return volume;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
