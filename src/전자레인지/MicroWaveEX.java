package 전자레인지;

import java.util.Scanner;

//강사님 버전.
// 5분(300) 버튼, 1분(60) 버튼, 10초 버튼
// 최소 횟수로 눌러서 요리 시간을 설정하는 문제
// 시간을 맞출 수 없으면 -1 반환
public class MicroWaveEX {
    public static void main(String[] args) {
        int T, A, B, C; // 요리 시간을 초로 입력, A=5분, B=1분, C=10초
        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간을 입력하세요");
        T = sc.nextInt();
        if (T % 10 != 0) {
            System.out.println("-1");
            return;
        }
        A = T / 300; // 5분 버튼에 대한 몫
        B = T % 300 / 60; // 1분 버튼이 눌려진 수
        C = T % 300 % 60 / 10; // 10초 버튼이 눌려진 수
        System.out.printf(" %d %d %d\n", A, B, C);
    }
}
