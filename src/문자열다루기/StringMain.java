package 문자열다루기;
// StringBuffer : 멀티스레드 환경에서 안전
// StringBuilder : 문자열을 추가하거나 변경할 때 사용, 멀티스레드를 고려 하지 않음
// String

public class StringMain {
    public static void main(String[] args) {
        String rst = "Hello";
        rst += " ";
        rst += "Java";
        rst += " ";
        rst += "Programming";

        System.out.println(rst);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.append(" ");
        sb.append("Programming");
        System.out.println(sb);

    }
}
