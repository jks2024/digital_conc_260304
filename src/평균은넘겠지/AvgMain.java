package 평균은넘겠지;

import java.util.Arrays;
import java.util.Scanner;

public class AvgMain {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt = sc.nextInt();
        double[] result = new double[cnt];
        for (int i = 0; i < cnt; i++) {
            result[i] = overRate();
        }

        // forEach
        Arrays.stream(result).forEach(e->System.out.printf("%.3f%%\n", e));
    }

    static double overRate() {
        int studentCnt = sc.nextInt();
        double[] score = new double[studentCnt];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        // 평균구하기
        double avg = Arrays.stream(score).average().orElse(0.0);

        // 평균을 넘는 인원수 구하기 : fiter와 count
        int overCnt = (int) Arrays.stream(score).filter(s -> s > avg).count();

        // 결과 반환
        return (double) overCnt / studentCnt * 100; // 백분율로 표시
    }
}
