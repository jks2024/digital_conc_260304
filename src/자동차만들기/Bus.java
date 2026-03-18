package 자동차만들기;

public class Bus extends Car implements AutoDrive, AirCon {
    private boolean isAutoDrive;
    private boolean isAirCon;

    public Bus(String name) {
        super(150, 5, 100, 20, name);
        isAutoDrive = false;
        isAirCon = false;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }

    @Override
    void applyOptions() {
        if (isAirCon) fuelEff = (int) (fuelEff * 0.95);
        if (isAutoDrive) maxSpeed = (int) (maxSpeed * 0.90);
    }

    @Override
    void printOptions() {
        System.out.println("에어컨 : " + (isAirCon ? "ON" : "OFF") );
        System.out.println("자율주행 : " + (isAutoDrive ? "ON" : "OFF"));
    }

    @Override
    public void airConOnOff(boolean isOn) {
        this.isAirCon = isOn;
    }

    @Override
    public void autoOnOff(boolean isOn) {
        this.isAutoDrive = isOn;
    }
}
