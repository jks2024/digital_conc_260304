package 집합로또번호생성기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1 ~ 45 사이의 임의의 수 6개 생성, 중복되면 안됨 (ArrayList 사용)
// 1 ~ 45 사이의 임의의 수 6개 생성, 중복되면 안됨 (집합 사용)
public class LottoMain {
    public static void main(String[] args) {
        // ArrayList 를 이용한 중복 제거
        List<Integer> lotto = new ArrayList<>();

        while (lotto.size() < 6) { // 6 미만 동안 반복 수행
            int num = (int) (Math.random() * 45) + 1;  // 1 ~ 45 사이의 임의의 정수 값 생성
            if (!lotto.contains(num)) {  // 리스트에 생성된 로또 번호가 포함되어 있는지 확인
                lotto.add(num);  // 현재 생성된 번호를 리스트에 추가 : 6번 add() 됨
            }
        }
        System.out.println(lotto);


        // 집합을 이용한 중복 제거
        Set<Integer> lottoSet = new HashSet<>();
        while (lottoSet.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            lottoSet.add(num);
        }
        System.out.println(lottoSet);


    }
}
