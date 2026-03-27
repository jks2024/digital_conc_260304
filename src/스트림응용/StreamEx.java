package 스트림응용;

import java.util.ArrayList;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<TravelCustomer> travelCustomers = new ArrayList<>();
        TravelCustomer customer1 = new TravelCustomer("안유진", 23, 1000);
        TravelCustomer customer2 = new TravelCustomer("장원영", 22, 1200);
        TravelCustomer customer3 = new TravelCustomer("이서", 19, 800);
        TravelCustomer customer4 = new TravelCustomer("레이", 19, 700);
        travelCustomers.add(customer1);
        travelCustomers.add(customer2);
        travelCustomers.add(customer3);
        travelCustomers.add(customer4);

        // 이름순으로 고객 명단 출력
        travelCustomers.stream()
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(System.out::println);  // 메서드 참조

        // 전제 여행 경비 합산
        int total = travelCustomers.stream()
                .mapToInt(TravelCustomer::getPrice)
                .sum();  // sum() 집계 함수이며 종단연산
        System.out.println("총 여행 비용 : " + total);

        // 20세 이상 명단 출력
        travelCustomers.stream()
                .filter(e -> e.getAge() >= 20)
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(System.out::println);


    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }
}
