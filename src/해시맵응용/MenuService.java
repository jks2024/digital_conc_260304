package 해시맵응용;

import java.util.HashMap;
import java.util.Map;

public class MenuService {
    private final Map<String, Menu> map = new HashMap<>();

    // 초기 데이터
    public void initMenu() {
        map.put("Americano", new Menu("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new Menu("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new Menu("Latte", 4000, "Coffee", "우유 포함"));
    }

    // 전체 조회
    public void menuList() {
        System.out.println("======= 전체 메뉴 보기 =======");
        for (String key : map.keySet()) {  // Map에서 키를 뽑아서 키를 기준으로 반복 순회
            System.out.println(map.get(key));  // 키값으로 엔티티(키, 값) 가져 옴
        }
    }

    // 메뉴 검색
    public void searchMenu(String key) {
        if (map.containsKey(key)) { // map에 해당 키가 존재 여부 확인
            System.out.println(map.get(key));
        } else {
            System.out.println("해당 메뉴가 존재 하지 않습니다.");
        }
    }

    // 메뉴 추가
    public void insertMenu(String key, int price, String category, String desc) {
        if (!map.containsKey(key)) {
            map.put(key, new Menu(key, price, category, desc));
            System.out.println("메뉴가 추가 되었습니다.");
        } else {
            System.out.println("해당 메뉴가 이미 존재 합니다.");
        }
    }

    // 메뉴 삭제
    public void removeMenu(String key) {
        if (map.containsKey(key)) {
            map.remove(key);  // 키를 이용해 엔티티(키, 값) 삭제
            System.out.println(key + " 메뉴를 삭제 했습니다.");
        } else {
            System.out.println("삭제할 메뉴가 없습니다.");
        }
    }

    // 메뉴 수정
    public void updateMenu(String key, int price, String category, String desc) {
        if (map.containsKey(key)) {
            map.replace(key, new Menu(key, price, category, desc));
            System.out.println("메뉴가 수정 되었습니다.");
        } else {
            System.out.println("수정 할 메뉴가 없습니다.");
        }
    }
}
