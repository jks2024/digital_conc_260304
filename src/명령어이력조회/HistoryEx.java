package 명령어이력조회;
// Queue : FIFO(First In First Out)
// - 자바에서 큐는 LinkedList를 활용하여 생성

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HistoryEx {
    final static Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력 하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print("$ ");
            String cmd = sc.nextLine().trim();  // 좌우의 공백 제거
            if (cmd.equalsIgnoreCase("q")) {  // equalsIgnoreCase 대소문자 구분 하지 않음
                System.exit(0);  // 프로그램 강제 종료
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 출력");
            } else if (cmd.equalsIgnoreCase("history")){
                save(cmd);
                int cnt = 0;
                for (String s : queue) {
                    cnt++;
                    System.out.println(cnt + " : " + s);
                }
            } else {
                save(cmd);
                System.out.println(cmd);
            }
        }
    }

    static void save(String cmd) {
        queue.offer(cmd);  // 객체를 추가, 맨뒤에 추가
        if (queue.size() > MAX_SIZE) queue.remove(); // 큐의 맨앞의 요소를 제거
    }

}
