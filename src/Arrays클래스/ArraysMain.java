package Arrays클래스;
// Arrays 클래스 : 배열을 다루기 위한 다양한 메서드가 포함 되어 있음. (그렇게 많이 쓸 이유는 없음)

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysMain {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 99, 300, 450, 999, 1};
        Arrays.sort(arr);  // 오름 차순 정렬
        System.out.println(Arrays.toString(arr));

        // 내림 차순 정렬
        //Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.binarySearch(arr, 999));

        // 정렬 조건 오버라이딩
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;  // 오름 차순
                else if (o1 < o2) return -1;  // 그냥 현상태유지
                else return 0;  // 두개의 값이 같다는 의미
            }
        });
        System.out.println(Arrays.toString(arr));  // Arrays.toString() 배열의 요소 값을 찍도록 오버라이딩 되어 있음


        // 연습 문제
        // 임의의 10개의 과일이름 입력 후 길이 순으로 정렬하기, 길이가 같으면 사전순으로 정렬하기

    }
}
