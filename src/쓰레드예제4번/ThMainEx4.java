package 쓰레드예제4번;
//쓰레드를 안전하게 종료 하기, stop()메소드는 사용 중지 됨

import static java.lang.Thread.sleep;

public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();

        sleep(1000);
        runThread.setStop(true);

    }
}

class RunThread extends Thread {
    private boolean stop = false; // stop 클래스 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread 실행 중........");

        }
        System.out.println("자원 정리.....");
        System.out.println("실행 종료.....");

    }
}



