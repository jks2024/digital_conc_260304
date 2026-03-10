package 문자열실습;

// 1번 : 입력 문자열에 대해 대/소문자 변경
// 입력 : AbCdEfG => aBcDeFg
// 문자열에서 chatAt()을 이용해 문자를 추출하고 추출된 문자가 대문자인지 소문자인 판별해서 풀기

// 2번 : 문자열 추가 하기  : lenth(), sustring()
// 2개의 문자열을 변수 s와 k에, 양의 정수를 정수형 변수 n에 각가 전달 받아,
// s 문자열의 뒤 부분의 n개 문자를 k문자열 앞에 끼워 넣는 코드 작성
// 입력 : s = "seoul", k = "korea", n = 2
// 결과 : ulkorea

// 3번 : 알고리즘 문제 풀리 > 3단계-중급문제 > KMP는 왜 KMP일까?
// 입력 : Knuth-Morris-Pratt => KMP
// - 대문자만 골라내서 출력 하는 방법
// - 첫번째 문자 출력 이후 '-'문자를 찾아서 그 다음에 오늘 문자 출력
// - split("-") 문자열을 부분 문자열로 분리하고 부분 문자열의 첫번째 문자 출력
// - 문자열을 문자배열로 바꾸고 ASCII 코드값으로 대문자 추출 하는 방식


import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {

        //stringLowUpperChange();
        //stringAdd();
        // kmpUpper();
        // hyPhenNext();
        splitHyphen();

    }

    static void stringLowUpperChange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {  // 문자열 길이 만큼 순회
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {  // 인덱스에 해당하는 문자 추출해서 소문자이면
//                System.out.print((char) (str.charAt(i) - ('a' - 'A')));  // 현재의 문자에서 - (소문자 - 대문자)
//            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                System.out.print((char) (str.charAt(i) + ('a' - 'A')));
//            } else {
//                System.out.print(str.charAt(i));
//            }
//        }
        for (int i = 0; i < str.length(); i++) {  // 문자열 길이 만큼 순회
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {  // 추출한 문자가 대문자이면
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }

    }
    static void stringAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("s 문자열 : ");
        String s = sc.nextLine();
        System.out.print("k 문자열 : ");
        String k = sc.nextLine();
        System.out.print("n : ");
        int n = sc.nextInt();

        int pos = s.length() - n;  // 문자열 길이 -
        System.out.println(s.substring(pos) + k);


    }
    // 대문자만 골라내기
    static void kmpUpper() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 문자열에서 해당 인덱스 문자 추출
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }

    }
    // 첫번째 문자 출력, 하이픈 다음 문자 추출
    static void hyPhenNext() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) System.out.print(str.charAt(i)); // 첫번째 문자 출력
            else {
                if (str.charAt(i) == '-') System.out.print(str.charAt(i + 1));  // 하이픈 다음 문자 출력
            }
        }

    }
    // 하이픈 기준으로 자르기
    static void splitHyphen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        String[] arr = str.split("-");  // 문자열을 하이픈 기준으로 잘라서 부분 문자열로 이루어진 배열 생성
        for (String s : arr) { //
            System.out.print(s.charAt(0)); // 하이픈 기준으로 자른 문자열의 0번 인덱스 출력
        }

    }
    // 문자 배열로 변환
    static void charArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();  // 문자열을 문자 배열로 변환
        for (char c : chArr) {
            if (Character.isUpperCase(c)) System.out.print(c);
        }

    }


}
