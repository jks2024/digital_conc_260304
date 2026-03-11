package 영화표예매하기;
// MoivieTicket class를 사용해 객체 생성
// 입력을 받기 위한 스캐너 객체 생성
// 메뉴 기능 구현을 위해 무한 반복문
// 메뉴 이름 출력
// 메뉴 선택 하기
// 선택된 메뉴 실행


import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket class에 대한 ticket 참조 변수에 MovieTicket() 객체의 주소를 대입
        MovieTicket ticket = new MovieTicket(12000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 영화 예매 시스템 =====");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: ticket.selectSeat(); break;
                case 2: ticket.cancelSeat(); break;
                case 3:
                    System.out.println("총 판매 금액 : " + ticket.getTotalPrice());
                    return;
                default: System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }

        }



    }
}
