package 배열실습문제;
// 알고리즘 문제풀이 > 3단계 중급 문제 > 핸드폰 요금
// - 영식 요금제 : 30초마다 10원, 기본 통화 10
// - 민식 요금제 : 60초마자 15원, 기본 통화 15
// - 통화의 개수 : 20
// - 통화 시간은 10000 보다 작은 자연수
// 알고리즘 문제풀이 > 3단계 중급 문제 > 저항
// - 3개 저항값을 색상으로 입력
// - 첫번째 : 10의 자리 값
// - 두번째 : 1의 자리 값
// - 세번쩨 : 곱의 자리

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // 1번 문제
        //callPrice();

        // 2번 문제
        resistance();

    }

    static  void callPrice() {
        Scanner sc = new Scanner(System.in);
        int[] call = new int[20]; // 통화의 개수
        int yPay = 0, mPay = 0;   // 영식 요금제와 민식 요금제의 요금 계산을 위한 변수
        System.out.print("통화 횟수 입력 : ");
        int cnt = sc.nextInt();
        System.out.print("통화 시간 입력 : ");
        for (int i = 0; i < cnt; i++) {  // 통화 횟수에 대한 통화 시간을 입력
            call[i] = sc.nextInt();  // 통화 시간을 배열에 저장
        }
        for (int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10; // 영식 요금제 통화당 요금을 누적
            mPay += (call[i] / 60) * 15 + 15; // 민식 요금제 통화당 요금을 누적
        }
        if (yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("Y M " + yPay);
        }
    }

    static void resistance() {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int num1 = 0, num2 = 0, num3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("3개의 색상값 입력 : ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        for (int i = 0; i < color.length; i++) {
            if (str1.equals(color[i])) num1 = i;  // 입력 받은 컬러값과 배열 내의 컬러값이 같으면 해당 인덱스 값을 저장 함 (10의 자리)
            if (str2.equals(color[i])) num2 = i;  // 1의 자리
            if (str3.equals(color[i])) num3 = mul[i];
        }
        System.out.println((long)((num1 * 10) + num2) * num3);

    }
}
