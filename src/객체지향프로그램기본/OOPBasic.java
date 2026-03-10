package 객체지향프로그램기본;
// 객체지향프로그램 : 사물을 소프트웨어 속 객체로 추상화하여, 이들의 상태와 행동 그리고 상호작용을 통해 프로그램을 구성하는 방식
// 클래스 : 객체를 생성하기 위한 설계도, 속성(필드)과 동작(메서드)
// 객체 : 클래스를 기반으로 생성된 실제 데이터, 메모리에 할당된 인스턴스

// 객체지향 프로그래맹의 4가지 특징
// 상속 : 기존 클래스의 필드와 메서드를 그대로 물려 받는 것, 코드 재사용성이 목적, 필연적으로 다형성과 연결 됨
// 다형성 : 오버로딩(동일한 이름의 메서드를 매개변수의 개수와 타입으로 구분)과 오버라이딩(상속받은 메서드를 재정의)이 있음. 상속이 후 매서드를 재정의 하는 방식
// 캡슐화 : 필드와 메서드를 하나로 묶어, 외부에서 지정된 메서드를 통해서만 필드에 접근 하도록 허용하는 방식
// 추상화 : 복잡한 내부는 숨기고 필요한 정보만 노출, 객체화 될 수 없는 클래스나 인터페이스로 부터 상속 받는 것

import 시스템출력.SystemOut;

import java.util.Scanner;

import static java.lang.System.exit;

public class OOPBasic {
    public static void main(String[] args) {
        // TvRemoCon 클래스로 리모콘 객체 5개 생성
        TvRemoCon tv1 = new TvRemoCon();
        TvRemoCon tv2 = new TvRemoCon();
        TvRemoCon tv3 = new TvRemoCon();
        TvRemoCon tv4 = new TvRemoCon();
        TvRemoCon tv5 = new TvRemoCon();
        Scanner sc = new Scanner(System.in);

        // 메뉴 만들기 : 생성된 객체 중 아무거나 1개 객체 선정
        // 1. 전원 켜기
        // 2. 볼륨 조절
        // 3. 채널 변경
        // 4. 현재 리모콘 상태값 보기
        // 5. 종료 하기
        while (true) {
            System.out.println("1. 전원 켜기");
            System.out.println("2. 볼륨 조절");
            System.out.println("3. 채널 변경");
            System.out.println("4. 현재 리모콘 상태값 보기");
            System.out.println("5. 종료 하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    tv1.setPower(true);
                    break;
                case 2:
                    System.out.print("볼륨값 입력 : ");
                    int volume = sc.nextInt();
                    tv1.setVolume(volume);
                    break;
                case 3:
                    System.out.print("채널값 입력 : ");
                    int channel = sc.nextInt();
                    tv1.setChannel(channel);
                    break;
                case 4:
                    tv1.printRemoCon();
                    break;
                case 5:
                    System.out.println("TV를 종료 합니다.");
                    tv1.setPower(false);
                    exit(0);
                default:
                    System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }
        }
    }
}
