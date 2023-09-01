package 전자레인지;
// 3개의 시간 조절용 버튼 A,B,C
// 버튼 마다 일정 시간 지정 , 5분 ,1분, 10초
//음식마다 조리해야할시간 : T, 초단위  , ABC의 합이 정확히 T
// 단, 조작횟수는 최솟값일것.
// ex, 100초 C10번X, B1번+C4번이 정답
// T=234처럼, 시간을 정확히 맞출 수 없는 경우도 존재.

// 요리시간 입력, 정수, 범위 1<= T =< 10000
// ABC의 조작 횟수 차례대로 출력, 횟수 사이에는 빈칸,
// 누르지 않는 경우는 0을 출력, 맞출 수 없는 경우는 -1을 출력

import java.util.Scanner;

public class MicroWaveButton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간을 입력하세요.");

        //요리 시간 입력하기.
        int T = sc.nextInt();

         if (T<1 || T>10000) {
             System.out.println("요리의 조리 시간 범위를 벗어났습니다.");
         }

        // ABC버튼의 시간 설정.
        int[] buttonTimes = {300,60,10};

        //버튼을 누른 횟수
        int[] buttonpress = new int[3];

        for (int i=0; i <3; i++) {
            buttonpress[i] = T/buttonTimes[i];
            T %= buttonTimes[i];
        }

        if (T % 10 !=0) {
            System.out.println(-1);
        }else {
            for (int press : buttonpress) {
                System.out.print(press + "   ");
            }
        }
    }
}
