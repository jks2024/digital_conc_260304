package 배열실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력 받기 (5개의 가격을 연속으로 입력 받음)
// 세트 메뉴 가격 = (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 둘 중 싼 메뉴 가격) - 50(세트 할인)

// 실습 문제 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수 배열에 나누어 담아서 출력 하기

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 실습 문제 1번
        //hamburgerEx();
        // 실습 문제 2번
        evenOddEx();
    }

    static void hamburgerEx() {
        Scanner sc = new Scanner(System.in);
        int[]menu = new int[5];  // 5개의 정수 배열 생성

        System.out.print("햄버거 3개 음료 2개 가격 연속 입력 : ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int minBurger = menu[0];  // 배열 내의 값으로 최소 값을 지정
        int minDrink = menu[3];

        for (int i = 0; i < menu.length; i++) {
            if (i < 3 && minBurger > menu[i]) minBurger = menu[i];
            if (i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        System.out.printf("세트 메뉴 가격 : %d\n", minBurger + minDrink - 50);
    }

    static void evenOddEx() {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[8];  // 8개의 정수를 입력 받기 위한 배열 생성
        int[] oddArray = new int[8];    // 홀수 값을 저장하기 위한 배열 생성
        int[] evenArray = new int[8];   // 짝수값을 저장하기 위한 배열 생성

        // 8개의 정수값 입력 받기
        System.out.print("정수 값 입력 : ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }

        // 홀수 배열, 짝수 배열 나누어 담기
        int oddIndex = 0;
        int evenIndex = 0;
        for (int e : inputArray) {
            if (e % 2 == 0) evenArray[evenIndex++] = e;  // 값을 대입 후 인덱스를 증가
            else oddArray[oddIndex++] = e;
        }

        // 출력
        System.out.print("홀수 : ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddArray[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenArray[i] + " ");


    }
}
