package 전자레인지;

import java.util.Scanner;

public class MicroWaveButtonEx1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간을 입력하세요  :  "+ "초");

        int T = sc.nextInt();
        int A, B, C;
        if (T<1 || T>10000) {
            System.out.print("시간 범위를 벗어났습니다");
        if (T % 10 !=0) System.out.println("-1");
        else {

        }A = T/300;
        B = T % 300/ 60;
        C = T % 300/ 60/ 10;

        System.out.printf("%d %d %d/n", A,B,C);


        }
    }
}
