package 쓰레드예제2번;

import static java.lang.Thread.sleep;

public class ThMainEX21 {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(5); //sumthread가 작업을 완료할때까지 기다림

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //sleep(1);
        System.out.println("합 :" + sumThread.getSum());

    }
}
// main이 스타트했지만 쓰레드는 실행대기상태에서 운영체제에 개입까지 시간텀이 존재.
// sleep으로 버퍼를 줘야 함.

class SumThread extends  Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i=0; i <=990000000; i++) {
            sum += 1;
        }
    }
}
