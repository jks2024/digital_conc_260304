package 정렬실습;
// 임의의 10개의 과일이름 입력 후 길이 순으로 정렬하기, 길이가 같으면 사전순으로 정렬하기
// 반환값 0 : 두 객체가 같음을 의미
// 양수 : 정렬 조건
// 음수 : 현상태유지

// compareTo() : 사전순 정렬에서 사용
// 0 : 두개체가 같다는 의미
// 양수 : 첫 번째 객체가 두 번째 객체보가 크다는 의미
// 응수 : 처 번째 객체가 두 번째 객체보다 작다는 의미

import java.util.Arrays;
import java.util.Comparator;

public class SortEx1 {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;  // 정렬 조건
                else {
                    // 길이가 같으면 사전 순 정렬
                    if (o1.length() == o2.length()) return o1.compareTo(o2);
                    return -1; // 정렬 조건이 아님
                }
            }
        });

        System.out.println(Arrays.toString(fruit));

    }
}
