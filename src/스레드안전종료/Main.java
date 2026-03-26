package 스레드안전종료;
// stop() : 스레드를 종료하는 메서드인데 현재는 사용 중지
// stop 플래그 이용하는 방법
// interrupt() 메서드를 이용하는 방법


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.start();
        InterruptTest threadTest = new InterruptTest();
        threadTest.start();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]스레드 종료 [2]스레드 계속 : ");
            int menu = sc.nextInt();
            if (menu == 1) {
                //threadTest.setStop(true);
                threadTest.interrupt();
                break;
            }
        }
    }
}

class InterruptTest extends Thread {
    @Override
    public void run() {
        int cnt = 0;
        try {
            while (true) {
                cnt++;
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
        }
        System.out.printf("[%d]\n", cnt);
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}


class ThreadTest extends Thread{
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        int cnt = 0;
        while (!stop) {
            cnt++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.printf("[%d]\n", cnt);
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}