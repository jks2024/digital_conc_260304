package 해시맵응용;
// Map : Key와 Value의 쌍으로 이루어진 데이터를 저장 하는 자료 구조
// Key는 중족 될 수 없고, value는 중복 가능
// HashMap은 순서를 보장하지 않음

// Hash 함수 : 임의의 길이 데이터르를 고정된 길이로 매핑하는 함수
// 해시코드 : 자바에서는 객체의 메모리 주소값을 바틍으로 생성된 정수 값
// 해시 충돌(Collision) :서로 다른 키가 동일한 해시코드를 가는 경우, 버킷 내에 여러 노드가 생기며, 성능 저하의 원인이 됨

// [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료
// 1. Menu 클래스
// 2. MenuService
// 3. HashMain UI


import java.util.Scanner;

public class HashMain {
    // 다른 메서드에서 사용하게 하기 위해서 main 밖에 존재
    private static final MenuService service = new MenuService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        service.initMenu(); // 초기 메뉴 설정

        while (true) {
            System.out.println("1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: service.menuList(); break;
                case 2:
                    System.out.print("조회할 메뉴 입력 : ");
                    service.searchMenu(sc.next());
                    break;
                case 3:
                    System.out.print("추가 할 메뉴 입력 : ");
                    String key = sc.next();
                    System.out.print("가격 입력 : ");
                    int price = sc.nextInt();
                    System.out.print("카테고리 입력 : ");
                    String category = sc.next();
                    sc.nextLine();
                    System.out.print("설명 입력 : ");
                    String desc = sc.nextLine();

                    service.insertMenu(key, price, category, desc);
                    break;
                case 4:
                    System.out.print("삭제할 메뉴 입력 : ");
                    service.removeMenu(sc.next());
                    break;
                case 5:
                    System.out.print("추가 할 메뉴 입력 : ");
                    String uKey = sc.next();
                    System.out.print("가격 입력 : ");
                    int uPrice = sc.nextInt();
                    System.out.print("카테고리 입력 : ");
                    String uCategory = sc.next();
                    sc.nextLine();
                    System.out.print("설명 입력 : ");
                    String uDesc = sc.nextLine();

                    service.updateMenu(uKey, uPrice, uCategory, uDesc);
                    break;
                case 6:
                    System.out.println("프로그램을 종료 합니다.");
                    return;
                default:
                    System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }

        }


    }
}
