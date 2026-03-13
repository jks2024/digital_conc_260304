package 은행만들기;
import java.util.Scanner;

// 계좌를 미리 만들고 그 중 하나를 선택해서 동작하는 구조


public class BankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Scanner sc = new Scanner(System.in);

        // 은행에 대해 입금, 출금, 잔액 조회 메뉴 만들어 보기
        // 계좌 생성 개수 확인(?) : count값 확인
        while (true) {
            System.out.print("[1]입금 [2]출금 [3]잔액 [4]계좌 생성 수 [5]종료 : ");
            int menu = sc.nextInt();
            int money = 0;
            switch (menu) {
                case 1:
                    System.out.print("입금 금액을 입력 하세요 : ");
                    money = sc.nextInt();
                    kakao.deposit(money);
                    break;
                case 2:
                    System.out.print("출금 금액을 입력 하세요 : ");
                    money = sc.nextInt();
                    kakao.withdraw(money);
                    break;
                case 3:
                    kakao.printAccount();
                    break;
                case 4:
                    System.out.println("계좌 생성 개수 : " + Bank.getCount());
                    break;
            }
        }
    }
}
