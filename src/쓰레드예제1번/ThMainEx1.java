package 쓰레드예제1번;
// 하나의 프로그램 내에서 여러가지 일을 동시에 수행 하는 것
public class ThMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스를 상속 받아서 Thread 생성
        Thread testTh = new CustomThread();
        testTh.start();

        //Runnable 인터페이스를 상속 받아서 쓰레드를 만드는 방법.
        //상속관계가 필요하다면, Runnable을 사용해야 함.
        //System.out.println("Main에서 찍어 봅니다.");
        Runnable runTH = new interThread(); // 실제 작업 내용을 가지고 있지만 실제 쓰레드는 아님
        Thread runTH1 = new Thread(runTH);
        Thread runTH2 = new Thread(runTH);
        runTH1.start();
        runTH2.start();
        //System.out.println("Main에서 찍어 봅니다.");

        //익명 객체로 쓰레드를 만드는 방법.
        // 익명 객체가 자주 쓰이는 경우 : ui버튼 등을 만들 때, 쓰레드를 만들 때
        Runnable task = new Runnable() {
            @Override // Runnable 인터페이스는 객체를 가질 수 없기에, 자동으로 구현부생성
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("인터페이스 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 " + sum);
            }
        };
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();


        //람다식으로 구현하기
        Runnable task2 = () -> {
            int sum =0;
            for (int i =0; i < 10; i++) {
                sum += 1;
                System.out.println("인터페이스 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합" + sum);

            };
        Thread anonyTH2 = new Thread(task);
          anonyTH2.start();
    }

        }







//상속 받아서 쓰레드를 만드는 방법
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은쓰레드 : "+ sum);
        }
        System.out.println(Thread.currentThread() + "합 " + sum);
    }

    }

    class  interThread implements  Runnable {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("인터페이스 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 " + sum);
        }
    }

