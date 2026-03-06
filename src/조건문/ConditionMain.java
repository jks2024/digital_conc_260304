package 조건문;
// 제어문 : 조건문과 반복문 있음, 프로그램의 순차적인 흐름을 제어하기 위함.
// 조건문 : 주어진 조건식의 결과에 따라 조건 분기 후 실행
// 반복문 : 주어진 조건이 참인 동안 반복 수행

// 조건문의 종류
// if, if ~ else, if ~ else if ~ else : 조건식을 이용해 조건 분기, 모든 경우에 사용 가능
// switch ~ case : 조건값에 의한 분기, 정수값, 문자, 문자열, 실수값은 안됨
// 3항연산자 : 참과 거짓만 분기 할 때 사용, 연산자이기 때문에 출력 구문 내에서 사용 가능


import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();  //정수값 입력 받음
//
//        if (num > 100) {  // 조건식이 참인 경우 수행
//            System.out.println(num + "은 100 보다  커요");
//        } else if(num < 100) {
//            System.out.println(num + "은 100 보다 작아요.");
//        } else {
//            System.out.println(num + "은 100과 같아요.");
//        }

        // 이름, 국어, 영어, 수학 성적을 입력 받기
        // 각각의 성적이 0 ~ 100 사이가 아니면 "성적 입력 오류" 출력 후 종료
        // 성적이 제대로 입력 되면 총점과 평균 구하기
        // 평균이 90점 이상이면 이름, 총점, 평균, 등급 : A
        // 평균이 80점 이상이면 이름, 총점, 평균, 등급 : B
        // 평균이 70점 이상이면 이름, 총점, 평균, 등급 : C
        // 평균이 60점 이상이면 이름, 총점, 평균, 등급 : D
        // 60점 미만이면 이름, 총점, 평균, 등급 : F
        System.out.print("이릅 : ");
        String name = sc.next();
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int mat = sc.nextInt();

        if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
            System.out.println("성적 입력 오류");
            return; // main() 메서드의 실행 결과 반환
        }

        int total = kor + eng + mat;
        double avg = (double) total / 3;
        char grade;  // 등급을 결정할 문자 변수 생성

        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';

        System.out.printf("%s, %d, %.2f, %c\n", name,total, avg, grade);
    }
}
