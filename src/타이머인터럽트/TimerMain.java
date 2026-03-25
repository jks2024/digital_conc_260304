package 타이머인터럽트;
// sleep() : 주어진 시간 동안 스레드를 일시 정지 상태로 만듬
// interrupt() : 일시 정지 상태의 스레드에서 InterruptException 발생시켜, 예외처리 코드를 실행

public class TimerMain {
    public static void main(String[] args) throws InterruptedException {
        TimerThread thread = new TimerThread();  // 쓰레드 생성
        thread.start(); // 스레드을 실행 대기 상태

        Thread.sleep(5000);  // 5초 대기
        thread.interrupt();  // 작업 중단

    }
}

class TimerThread extends Thread {
    @Override
    public void run() {
        System.out.println("작업 시작");
        int cnt = 0;

        for (int i = 0; i < 30; i++) {
            cnt++;
            System.out.println("작업 진행 : " + cnt);
            try {
                sleep(1000);  // 1초씩 일시 정지 상태로 만듬
            } catch (InterruptedException e) { // 예외처리 코드
                System.out.println("작업이 인터럽트로 인해 중단 됨" + e);
                return;
            }
        }
        System.out.println("작업완료 : " + cnt);
    }
}
