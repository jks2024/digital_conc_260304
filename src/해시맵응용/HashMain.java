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
    private static final MenuService service = new MenuService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


    }
}
