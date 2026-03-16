package 추상클래스;
// 추상클래스
// - 객체를 만들 수 없는 클래스
// - 일반 메서드와 추상메서드가 함께 있음
// - 공통 기능을 묶어 제공하고, 자식 클래스가 반드시 구현해야 할 메서드를 강제할 때 사용

public class AbstractMain {
    public static void main(String[] args) {
        AndroidPhone phone = new AndroidPhone("Samsung", true);
        phone.call();
        phone.setMode(true);

        ApplePhone apple = new ApplePhone("iPhone", false);
        apple.call();
        apple.setMode(false);


    }
}
