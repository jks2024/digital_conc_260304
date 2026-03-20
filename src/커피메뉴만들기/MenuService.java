package 커피메뉴만들기;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final List<CoffeeMenu> menuList;

    // 인스턴스 필드를 초기화 임
    public MenuService() {
        menuList = new ArrayList<>();
        initMenu();
    }
    // 초기 메뉴 구성
    private void initMenu() {
        menuList.add(new CoffeeMenu("아메리카노", 2000, "음료", "기본 커피", true));
        menuList.add(new CoffeeMenu("라떼", 4000, "음료", "우유 커피", true));
        menuList.add(new CoffeeMenu("홍차", 4000, "차", "홍차 입니다.", false));
        menuList.add(new CoffeeMenu("바게트", 5000, "빵", "빵 입니다.", true));
        menuList.add(new CoffeeMenu("모카", 5000, "음료", "달달한 커피", true));
    }

    // 전체 메뉴 조회
    public List<CoffeeMenu> getMenuList() {
        return menuList;
    }

    // 메뉴 추가
    public void addMenu(CoffeeMenu menu) {
        menuList.add(menu);
    }

    // 메뉴 수정
    public boolean updateMenu(int index, CoffeeMenu menu) {
        if (index >= 0 && index < menuList.size()) {
            menuList.set(index, menu);
            return true;
        } else return false;
    }

    // 메뉴 삭제
    public boolean deleteMenu(int index) {
        if (index >= 0 && index < menuList.size()) {
            menuList.remove(index);
            return true;
        } else return false;
    }

    // 메뉴 검색
    public CoffeeMenu searchMenu(String name) {
        for (CoffeeMenu menu : menuList) {
            if (menu.getName().equals(name)) {
                return menu;
            }
        }
        return null;
    }

}
