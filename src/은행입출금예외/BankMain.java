package 은행입출금예외;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===========================");
            System.out.println("   은행 계좌 관리 시스템");
            System.out.println("===========================");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("0. 종료");
            System.out.println("---------------------------");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("입금 : ");
                    int amount = sc.nextInt();
                    try {
                        account.deposit(amount);
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("출금 : ");
                    int with = sc.nextInt();
                    try {
                        account.withdraw(with);
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(account.getBalance());
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("메뉴 선택이 잘 못 되었습니다.");

            }


        }

    }
}
