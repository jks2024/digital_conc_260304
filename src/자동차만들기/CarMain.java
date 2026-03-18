package 자동차만들기;

import java.util.Scanner;

import static 자동차만들기.Common.DISTANCE;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = null;  // 부모 클래스의 참조 변수
        int loc = 0, cnt = 0, type = 0, option = 0, weather = 0;

        // 이동 지역
        while (true) {
            System.out.print("\n이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            loc = sc.nextInt();
            if (loc >= 1 && loc <= 4) break;
            System.out.println("이동할 지역 선택이 잘못되었습니다.");
        }
        // 승객 수
        while (true) {
            System.out.print("이동할 승객 수 입력 (1~100): ");
            cnt = sc.nextInt();
            if (cnt >= 1 && cnt <= 100) break;
            System.out.println("승객 수는 1~100명 사이여야 합니다.");
        }
        // 차량 선택
        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            type = sc.nextInt();
            if (type >= 1 && type <= 3) break;
            System.out.println("차량 선택이 잘못되었습니다.");
        }
        // 부가 기능
        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if (option == 1 || option == 2) break;
            System.out.println("모드 선택이 잘못되었습니다.");
        }
        boolean isMode = (option == 1);

        // 자동차 객체 대입
        switch (type) {
            case 1: car = new SportCar("람로르기니"); break;
            case 2: car = new Sedan("G80"); break;
            case 3: car = new Bus("리무진 버스"); break;
            default: System.out.println("없는 차량 입니다.");
        }

        car.setMode(isMode);

        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) break;
            System.out.println("날씨 선택이 잘못되었습니다.");
        }

        if (car instanceof AirCon airCon) {
            int select;
            while (true) {
                System.out.print("에어컨 [1]ON [2]OFF : ");
                select = sc.nextInt();
                if (select == 1 || select == 2) break;
                System.out.println("잘못된 입력 입니다.");
            }
            if (select == 1) airCon.airConOnOff(true);
            else airCon.airConOnOff(false);
        }

        if (car instanceof Audio audio) {
            int select;
            while (true) {
                System.out.print("오디오 [1]ON [2]OFF : ");
                select = sc.nextInt();
                if (select == 1 || select == 2) break;
                System.out.println("잘못된 입력 입니다.");
            }
            if (select == 1) audio.audioOnOFF(true);
            else audio.audioOnOFF(false);
        }

        if (car instanceof AutoDrive autoDrive) {
            int select;
            while (true) {
                System.out.print("자율주행 [1]ON [2]OFF : ");
                select = sc.nextInt();
                if (select == 1 || select == 2) break;
                System.out.println("잘못된 입력 입니다.");
            }
            if (select == 1) autoDrive.autoOnOff(true);
            else autoDrive.autoOnOff(false);
        }

        car.applyOptions(); // 연비와 속도 보정

        int moveCnt = car.getMovingCnt(cnt);
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 : " + car.getTotalCost(DISTANCE[loc], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(DISTANCE[loc], moveCnt) + "회");
        System.out.println("총 이동 시간 : " + car.getMovingTime(DISTANCE[loc], moveCnt, weather));

        car.printOptions();
    }
}
