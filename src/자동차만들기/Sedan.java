package 자동차만들기;

public class Sedan extends Car implements AirCon, Audio, AutoDrive{
    private boolean isAirCon;
    private boolean isAudio;
    private boolean isAutoDrive;

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
        isAirCon = false;
        isAudio = false;
        isAutoDrive = false;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) seatCnt += 1;
    }

    @Override
    void applyOptions() {
        if (isAirCon) fuelEff = (int) (fuelEff * 0.95);
        if (isAutoDrive) maxSpeed = (int) (maxSpeed * 0.90);
    }

    @Override
    void printOptions() {
        System.out.println("에어컨 : " + (isAirCon ? "ON" : "OFF") );
        System.out.println("오디오 : " + (isAudio ? "ON" : "OFF") );
        System.out.println("자율주행 : " + (isAutoDrive ? "ON" : "OFF"));
    }

    @Override
    public void audioOnOFF(boolean isOn) {
        this.isAudio = isOn;

    }

    @Override
    public void autoOnOff(boolean isOn) {
        this.isAutoDrive = isOn;
    }

    @Override
    public void airConOnOff(boolean isOn) {
        this.isAirCon = isOn;
    }
}
