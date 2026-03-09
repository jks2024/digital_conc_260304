package While문실습;
// 이름은 문자열로 입력
// 나이는 정수로 입력 받는데, 0 ~ 199까지는 정상 입력, 나머지수는 "나이 입력이 잘 못 되었습니다." 재 입력 받기
// 성별은 문자로 입력, 'M', 'm', 'F', 'f'만 정상 입력으로 간주하고 다른 문자이면 "성별을 잘 못 입력 하셨습니다," 재 입력 받기
// 직업은 정수로 입력 [1]회사원 [2]학생 [3]주부 [4]무직, 1 ~ 4 사이의 값이 아니면 "직업을 잘 못 입력 하셨습니다." 재 입력 받기
// - 출력은 "회사원", "학생", "주부", "무직"
// 모든 입력이 정상적으로 입력되면 출력 하기

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();

        int age;
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) break;
            System.out.println("나이 입력이 잘 못 되었습니다.");
        }

        char gender;
        while (true) {
            System.out.print("성별을 입력 하세요 [M/F] : ");
            gender = sc.next().toLowerCase().charAt(0);  // 소문자로 변경
            if (gender == 'm' || gender == 'f') break;
            System.out.print("성별을 잘 못 입력 하셨습니다.");
        }

        int job;
        while (true) {
            System.out.print("직업을 입력 하세요 [1]회사원 [2]학생 [3]주부 [4]무직 : ");
            char jobTmp = sc.next().charAt(0);
            if (Character.isDigit(jobTmp)) { // 숫자로 변환 가능 한지 확인
                job = (int) jobTmp - '0';  // ASCII 코드값으로 계산
                if (job >= 1 && job <= 4) break;
                System.out.println("직업 선택 코드가 잘 못 되었습니다.");
            } else {
                System.out.println("직업 코드는 숫자로 입력 하세요.");
            }
        }
        final String[] jobs = {"", "회사원", "학생", "주부", "무직"};
        System.out.println("=".repeat(10) + "회원정보" + "=".repeat(10));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + ((gender == 'm') ? "남성" : "여성"));
        System.out.println("직업 : " + jobs[job]);






    }
}
