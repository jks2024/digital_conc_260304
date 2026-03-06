package 스위치실습1번;
// 좌변 값, 연산자, 우변값을 입력 받아 산술 연산(+, -, *, /, %)을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68


import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");
        int x = sc.nextInt();
        char op = sc.next().charAt(0); // 문자 입력 (연산자)
        int y = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println("연산자 입력이 잘 못 되었습니다.");
                break;

        }

    }
}
