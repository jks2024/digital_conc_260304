package 다형성2번;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        // 운전자 생성
        // 1. 버스
        // 2. 택시
        // 3. 스포츠카
        Scanner sc = new Scanner(System.in);
        Driver driver = new Driver("장원영");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                driver.drive(new Bus());

                break;
            case 2:
                driver.drive(new Taxi());
                break;
            case 3:
                driver.drive(new SportCar());
                break;
        }

        // 실습 예제 : 차량을 추가 해보기
        // 오버라이딩 -> 오버로딩으로 변경 가능한지 검토 (Driver 클래스의 drive 메서드)


    }
}
