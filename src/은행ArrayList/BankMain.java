package 은행ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        ArrayList<NewBank> bankList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(32));
            System.out.println("[1]계좌개설 [2]계좌선택 [3]전제조회 [4]계좌수 [5]종료 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("은행명 입력 : ");
                    String bankName = sc.next();
                    System.out.print("예금주 입력 : ");
                    String name = sc.next();
                    System.out.print("초기 입금액 : ");
                    int money = sc.nextInt();
                    bankList.add(new NewBank(bankName, name, money));  // 리스트에 마지막에서 새로운 객체를 추가
                    break;
                case 2:
                    // 전체 계좌 목록 보여 주기
                    System.out.println("----- 계좌 목록 -----");
                    for (NewBank bank : bankList) {
                        bank.printAccount();
                        System.out.println("-".repeat(32));
                    }
                    System.out.print("계좌 번호 입력 : ");
                    int id = sc.nextInt();
                    NewBank selectedBank = null; // 가리키는 대상이 없음
                    for (NewBank bank : bankList) {
                        if (bank.getId() == id) {  // 입력 받은 계좌 번호와 일치하는 계좌의 객체를 반환
                            selectedBank = bank;
                            break;
                        }
                    }
                    selectedBank.printAccount();
                    break;
            }

        }

    }
}
