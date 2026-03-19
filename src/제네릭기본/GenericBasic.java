package 제네릭기본;
import java.util.ArrayList;
import java.util.List;

// 제네릭 : 데이터의 타입을 일반화하여, 다양한 타입의 데이터를 하나의 코드로 처리 할 수 있도록 해주는 자바의 기능
// - 컴파일 시 타입을 지정하여 타입 안정성 확보
// - 불필요한 형변환 제거
// - 코드 재사용성 증가
public class GenericBasic {
    public static void main(String[] args) {
        // 제네릭으로 만들어져 있으며 생성 시 <타입변수>지정해 타입 안정성 확보
        List<String> list = new ArrayList<>();
        list.add("정경수");
        list.add("안유진");

        for (Object name : list) {
            System.out.println(name);
        }

        Person<String> p1 = new Person<>("곰돌이");
        System.out.println(p1.getInfo());
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p2.getInfo());
    }
}


// T는 예약어는 아니고, 관례상 대문자 T로 많이 사용
class Person<T> {
    private T info;
    public Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}
