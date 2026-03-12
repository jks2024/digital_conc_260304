package 상속기본;
// 상속 : 부모클래스의 유산(필드, 메서드)을 자식클래스에게 물려 주는 것
// - 재사용성을 위해서 주로 사용, 상속 받은 기능을 변경하면 오버라이딩 (다형성)
// - extends 상속을 받을 때 사용하는 키워드
// - 자식클래스는 부모클래스의 모든 내용을 포함하고 있기 때문에 같거나 크다.

public class InheritanceBasic {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog();  // dog 객체 생성
        dog.setName("댕댕이");;
        System.out.println(dog.getName());
        dog.sleep(3);
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

// Animal class로 부터 상속 받음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }
}

class HouseDog extends Dog {
    @Override  // 오버라이딩 관계 성립 여부를 확인하는 어노테이션
    void sleep() {
        System.out.println(name + "가 집에서 잠을 잡니다.");
    }
    // 오버로딩
    void sleep(int hour) {
        System.out.println(name + "가 집에서 " + hour + "시간 동안 잠을 잡니다.");
    }
}