package 에어컨만들기;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        AirCon myAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);

        System.out.print("예어컨을 켜시겠습니까? (yes / no) : ");
        String onOff = sc.nextLine();

        if (onOff.equalsIgnoreCase("yes")) {
            myAirCon.setPower(true); // 원래는 게터를 사용하는게 원칙
            myAirCon.setAirCon(sc);
            myAirCon.operate();
        } else {
            System.out.println("에어컨을 켜지 않습니다.");
        }
    }
}
