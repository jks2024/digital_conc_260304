package For문;
// for(초기값;최종값;증감값) { }


import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

//        int i = 0;
//        for(;;) {
//            System.out.print("* ");
//            i++;
//            if (i == num) break;
//        }
//        System.out.println();

        // 정수값을 입력 받음
        // 입력 받은 정수값 범위의 5의 배수를 1줄에 10개씩 출력 하기
//        int cnt = 0;
//        for (int i = 1; i <= num; i++) {
//            if (i % 5 == 0) {
//                System.out.printf("%4d", i);
//                cnt++;
//            }
//
//            if (cnt == 10) {
//                System.out.println();  // 10개 출력 후 줄바꿈
//                cnt = 0; // cnt 초기화
//            }
//        }

        // 정수 num을 입력 받아 num * num 출력하기
        // 싱글 for문 사용하기
        // 입력 : 4
        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16
        for (int i = 1; i <= num * num; i++) {
            System.out.printf("%4d", i);  // 4자리의 공간을 확보하고 오른쪽 정렬
            if (i % num == 0) System.out.println(); // 입력 받은 수의 배수에서 줄바꿈
        }

        // 문자열을 입력 받아 역순으로 출력 하기
        String rst = "";
        sc.nextLine();
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            rst += str.charAt(i); // rst = rst + str.charAt(i);
        }
        System.out.println(rst);


    }
}
