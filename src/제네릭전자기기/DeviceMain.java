package 제네릭전자기기;

import java.util.Scanner;

public class DeviceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeviceController<Device> dc = new DeviceController<>();
        System.out.print("기기 선택 [1]프린터 [2]모니터 [3]키보드 : ");
        int menu = sc.nextInt();
        Device device = null;

        switch (menu) {
            case 1: device = new Printer(); break;
            case 2: device = new Monitor(); break;
            case 3: device = new KeyBoard(); break;
            default: System.out.println("기기 선택이 잘 못 되었습니다.");
        }

        dc.setDevice( device);
        dc.powerOn();
        dc.powerOff();

        sc.close();
    }
}
