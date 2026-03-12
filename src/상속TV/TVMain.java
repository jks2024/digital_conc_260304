package 상속TV;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {

        // TV 메뉴 만들기
        // 1. TV 켜기
        // 2. Volume 설정 하기
        // 3. 채널 변경 시 Smart 기능을 켜면 채널 설정은 없음
        //    - Smart 기능을 끄면 채널 설정 기능 활성화
        // 4. TV 상태 보기
        // 5. 종료 하기
        ProductTV tv = new ProductTV(false, 11, 10, "LG TV");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 전원 켜기");
            System.out.println("2. 볼륨 조절");
            System.out.println("3. 채널 변경");
            System.out.println("4. 현재 TV 상태값 보기");
            System.out.println("5. 종료 하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("TV 전원을 켜시겠습니까? (yes / no) : ");
                    String power = sc.next();
                    if (power.equals("yes")) tv.setPower(true);
                    else tv.setPower(false);
                    break;
                case 2:
                    System.out.print("볼륨값 입력 : ");
                    int volume = sc.nextInt();
                    tv.setVolume(volume);
                    break;
                case 3:
                    System.out.print("스마트 모드 켜기 (ON/OFF) : ");
                    String smart = sc.next();
                    if (smart.equals("ON")) {
                        tv.setChannel(0, true);
                    } else {
                        System.out.print("채널 값 입력 : ");
                        int channel = sc.nextInt();
                        tv.setChannel(channel);
                    }
                    break;
                case 4:
                    tv.printTV();
                    break;
                case 5:
                    tv.setPower(false);
                    System.out.println("TV를 종료 합니다.");
                    return;
                default:
                    System.out.println("메뉴 선택이 잘 못 되었습니다.");
                    break;
            }
        }
    }
}
