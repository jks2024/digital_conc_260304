package 스레드기본;

// 멀티스레드 : 작업을 병렬로 처리하기 위해서 사용
// - 백엔드에서 여러 사용자의 요청을 동시에 수행하기 위해서 주로 사용 함
// - 스레드를 만드는 방법은 상속과 interface 통해서 하는 방법이 존재 함

public class ThreadMain {
    public static void main(String[] args) {
        // Thread 클래스 상속
        CustomeThread thread1 = new CustomeThread();
        thread1.start();

        // Runnable 인터페이스 구현
        CustomRunnable runnable = new CustomRunnable();  // 인터페이스를 상속 받아 객체 생성, 스레드 수행 작업은 가지고 있지만 스레드는 아님
        Thread thread2 = new Thread(runnable);  // 실제 쓰레드를 만들기 위해 쓰레드 객체 생성
        thread2.start();

    }
}

// Thread 클래스 상속으로 구현 : 단일 상속만 가능
class CustomeThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println(Thread.currentThread() + " : " + sum);
        }
        //System.out.println(Thread.currentThread().getName() + " : " + sum);
    }
}

// Runnable 인터페이스 구현
class CustomRunnable implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println(Thread.currentThread() + " : " + sum);
        }
    }
}