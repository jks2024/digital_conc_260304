package 상속TV;

// 상속을 주기 위한 TV 만들기
public class ProtoTypeTV {
    // 전원
    protected boolean power;
    // 채널
    protected int channel;
    // 볼륨
    protected int volume;

    // 매개변수가 없는 생성자
    ProtoTypeTV() {
        power = false;
        channel = 1;
        volume = 10;
    }

    // 매개변수가 전부 있는 생성자 : ProtoTypeTV(boolean power, int cnl, int vol)
    ProtoTypeTV(boolean power, int cnl, int vol) {
        this.power = power;
        this.channel = cnl;
        this.volume = vol;
    }

    // 채널 설정은 1 ~ 999까지 설정 가능하도록 만들기
    void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 999) {
            this.channel = cnl;
        } else {
            System.out.println("채널 설정이 잘 못 되었습니다.");
        }
    }

    void setVolume(int vol) {
        this.volume = vol;
    }

    // 전원을 켜고 끄는 기능 만들기
    void setPower(boolean on) {
        this.power = on;
        System.out.println("전원을 " + (on ? "ON" : "OFF") + "했습니다.");
    }

}
