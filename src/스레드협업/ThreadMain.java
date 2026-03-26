package 스레드협업;
// 두 개의 스레드가 번갈아 가면서 실행해야 하는 경우에 대한 예제
// notify() : 일시 정지 상태에 있는 다른 스레드를 실행 대기 상태로 만듬
// notifyAll() : 일시 정지 상태에 있는 모든 스레드를 실행 대기 상태로 만듬
// wait() : 자신을 대기 상태로 만듬

public class ThreadMain {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();
        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);
        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify();  // 일시 정지 상태에 있는 다른 스레드를 싱행 대기 상태로 만듬
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("인터럽트 예외 발생");
        }
    }
    // synchronized 여러 스레드가 해당 메서드에 동시 점근 하는 것을 막기위해서 사용
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("인터럽트 예외 발생");
        }
    }
}

class ThreadA extends Thread {
    private final WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private final WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            workObject.methodB();
        }
    }
}



