package 조건문실습;
// 시간과 분을 입력 받아 45분 일찍 시간이 설정되도록 구현
// 23 45 => 23 00
// 0 30 => 23 45
// 0 45 = 0 0
// 13 40 => 12 55

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 시간 / 분 입력 받기
        System.out.print("시간 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 계산 편의를 위해서 전부 분으로 환산
        int calc = hour * 60 + min;

        // 환산된 분이 45 미만이면 하루치 시간을 더 해줌
        if (calc < 45) {
            calc = 24 * 60 + min; // 하루치 시간을 더해줌
        }

        // 환산된 시간에서 45를 빼줌
        calc -= 45;

        // 다시 시간과 분으로 환산 후 결과 출력
        System.out.printf("%d %d", calc / 60, calc % 60);
    }
}
