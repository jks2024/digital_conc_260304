package 추상클래스;

// abstract 키워드로 추상 클래스 생성
public abstract class Phone {
    protected String name;
    protected boolean power;
    protected boolean mode;

    public Phone(String name, boolean power) {
        this.name = name;
        this.power = power;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    // 통화 기능은 상속 받은 클래스에서 구현 하도록 함
    public abstract void call();

    // 추상 메서드
    public abstract void setMode(boolean mode);
    public abstract boolean getMode();
}
