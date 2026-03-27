package 스트림기본;
// 스트림의 동작 흐름 : 생성 -> 중간연산 -> 종단 연산이 하나의 동작 흐름으로 연결 됨

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 5 이상의 값 출력
        for (int e : list) {
            if (e >= 5) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
        // 스트림 생성.중간연산(filter).종단연산(forEach)
        list.stream()
                .filter(e -> e >= 5)
                .forEach(e->System.out.print(e + " "));

        System.out.println();

        // 짝수만 출력
        for (int e : list) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();

        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e->System.out.print(e + " "));


        // 5이상의 짝수만 출력
        for (int e : list) {
            if (e % 2 == 0 && e >= 5) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
        list.stream()
                .filter(e -> e % 2 == 0 && e >= 5)
                .forEach(e->System.out.print(e + " "));
        System.out.println();

    }
}
