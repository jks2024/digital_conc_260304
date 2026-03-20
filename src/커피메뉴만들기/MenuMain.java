package 커피메뉴만들기;

import java.util.List;
import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        MenuService service = new MenuService();  // MenuService 객체 생성
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        while (true) {
            System.out.println("[1]조회 [2]등록 [3]수정 [4]삭제 [5]검색 [6]종료 : ");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: printMenuList(service.getMenuList()); break;
                case 2: service.addMenu(inputMenu()); break;
                case 3:
                case 4:
                case 5:
                case 6: System.out.println("커피 메뉴를 종료 합니다."); return;

            }
        }
    }

    // 커피 목록 출력
    private static void printMenuList(List<CoffeeMenu> menuList) {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + " : " + menuList.get(i));
        }
    }

    // 신규 메뉴 입력 후 메뉴 객체 반환
    private static CoffeeMenu inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("분류 : ");
        String category = sc.nextLine();
        System.out.print("설명 : ");
        String desc = sc.nextLine();
        System.out.print("[1]세금 포함 [2]별도 : ");
        boolean tax = (sc.nextInt() == 1);
        return new CoffeeMenu(name, price, category, desc, tax);
    }
}
