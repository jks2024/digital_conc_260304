package 객체지향프로그램기본;

// 전원 ON/OFF, Volume, Channel
public class TvRemoCon {
    // 인스턴스 필드 정의 : 내부의 상태값을 저장하는데 객체의 갯수 만큼 생성됨 (객체마다 독립적인 값을 가짐)
    // 접근 제한자 : private은 클래스 내부에서만 접근 가능하고 외부에서는 접근 할 수 없음 (캡슐화)
    private boolean power;  // 전원 ON/OFF
    private int volume;     // Volume
    private int channel;    // Channel

    // 생성자 : 클래스가 객체로 만들어 질 때 자동 호출, 클래스 이름과 동일하고 반환 타입이 없음, 인스턴스 필드에 대한 초기값 부여
    TvRemoCon() {
        power = false;
        volume = 10;
        channel = 11;
    }

    // setter 메서드 : 필드에 값을 쓰는 메서드
     public void setPower(boolean onOff) {
        power = onOff;
        System.out.println("전원을 " + (power ? "ON" : "OFF") + " 합니다.");
    }
    // getter 메서드 : 필드의 값을 읽는 메서드
    public boolean getPower() {
        return power;
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("볼륨을 " + volume + "으로 변경 합니다.");
    }
    public int getVolume() {
        return volume;
    }
    public void setChannel(int ch) {
        channel = ch;
        System.out.println("채널을 " + channel + "로 변경 합니다.");
    }
    public int getChannel() {
        return channel;
    }

    // 현재의 리모콘 설정 상태를 출력
    void printRemoCon() {
        System.out.println("===== TV 리모콘 상태 출력 =====");
        // 전원은 3항 연산자를 사용해 ON/OFF
        System.out.printf("전원 : %s\n", (power ? "ON" : "OFF"));
        // Channel 정보 출력
        System.out.println("채널 : " + channel);
        // Volume 정보 출력
        System.out.println("볼륨 : " + volume);
    }
}
