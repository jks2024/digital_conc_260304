package 커피메뉴만들기;

// 커피 메뉴에 대한 객체 생성을 위한 클래스
public class CoffeeMenu {
    private String name;
    private int price;
    private String category;
    private String desc;
    private boolean isTax;

    public CoffeeMenu(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }
    @Override
    public String toString() {
        return String.format("이름 : %-10s | 가격 : %d | 카테고리 : %-5s | 설명 : %s | 세금 : %s",
                name, price, category, desc, (isTax ? "포함" : "미포함"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isTax() {
        return isTax;
    }

    public void setTax(boolean tax) {
        isTax = tax;
    }
}
