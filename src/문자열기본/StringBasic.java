package 문자열기본;
// 자바의 문자열은 참조 타입의 자료형, 객체를 만들어 사용하거나 리터럴 표기 방식으로 사용할 수 있으면, 리터럴 표기 방식이 유리

public class StringBasic {
    public static void main(String[] args) {
        String name1 = "곰돌이사육사";  // 리터럴 표기 방식
        String name2 = new String("곰돌이사육사");  // 안쓰임

        // equals() : 두개의 문자열을 비교하여 결과값을 리턴, 오버라이딩 되어 있음
        System.out.println(name1.equals(name2));  // true
        System.out.println(name1 == name2);  // 주소를 비교
        String text1 = "Spring";
        String text2 = "spring";
        System.out.println(text1.equalsIgnoreCase(text2)); // 대소문자를 구분하지 않고 비교

        // indexOf() : 문자열에서 특정 문자열의 시작 인덱스를 반환
        String text3 = "Java Programming Good";
        System.out.println(text3.indexOf("Progg"));  // 5, -1

        // contains(): 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴 (true / false)
        System.out.println(text3.contains("Java"));

        // chatAt(인덱스) : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(text3.charAt(5));  // P

        // replace("old", "new) : 문자열 중에서는 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용
        System.out.println(text3.replace("Java", "C++"));
        System.out.println(text3.replaceAll(" ", ""));

        // substring() : 문자열에서 특정 문자열을 추출 할 때 사용
        System.out.println(text3.substring(5)); // 5 ~
        System.out.println(text3.substring(5, 10));  // 5 ~ 10 미만까지 추출

        // toUpperCase(), toLowerCase() : 문자열을 전부 대문자/소문자로 변경
        System.out.println(text3.toUpperCase());
        System.out.println(text3.toLowerCase());

        // trim() : 문자열의 앞뒤의 공백을 잘라냄
        String text4 = "   Java Programming Good   ";
        System.out.println(text4.trim());
        System.out.println(text4);

        // split() : 문자열을 특정 문자열로 구분 하는 메서드
        String time = "10:32:34";  // 한개의 문자열
        String[] timeArr = time.split(":");  // :(콜론) 기준으로 여러개의 부문 문자열로 나누어서 배열에 저장
        System.out.printf("%s시 %s분 %s초", timeArr[0], timeArr[1], timeArr[2]);

        // 문자열 포매팅 : 문자열 내에서 특정 값을 삽입하는 방법 : printf() 유사
        int num = 4;
        String testFormat = String.format("나는 하루에 밥을 %d번 먹습니다.", num);
        System.out.println(testFormat);

        // toCharArray() : 문자열을 문자 배열로 변환
        String text5 = "Java C++ Programming";  // 하나의 문자열
        char[] text5Arr = text5.toCharArray();  // 하나의 문자열을 문자 배열로 변경
        for (char c : text5Arr) {
            System.out.print(c + " ");
        }



    }
}
