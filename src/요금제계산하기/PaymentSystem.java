package 요금제계산하기;

import java.util.Scanner;

// 영식 요금제 : 30초당 10원(1~29초에 10원, 30초가 되면 2통이 됨)
// 민식 요금제 : 60초당 15원(1~59초에 15원, 60초가 되면 2통이 됨)
// 첫번째 줄에 통화의 횟수(20 미만), 두번째 줄에 통화당 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y, 민식 요금제는 M
// 총 통화 요금이 같은 경우는 YM 총 통화요금 표시
public class PaymentSystem {
    public static void main(String[] args) {
        int[] call = new int[20]; // 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int ypay = 0, mpay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 통화 횟수에 대한 입력 받아 변수에 대입

        for (int i = 0; i < cnt; i++) { // 통화 횟수 당 통화 시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for (int i = 0; i < cnt; i++) {
            ypay += (call[i] / 30) * 10 + 10; // 기본 한 통화가 있음
            mpay += (call[i] / 60) * 15 + 15;
        }
        if (ypay > mpay) {
            System.out.println("M" + mpay);
        } else if (ypay < mpay) {
            System.out.println("Y" + ypay);
        } else {
            System.out.println("YM" + ypay);
        }
    }
}
















//        int[] call = new int[20];
//        int Ypay = 0, Mpay =0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("통화 시간을 입력하세요");
//        int n = sc.nextInt();
//        System.out.println("통화 횟수를 입력하세요");
//        for (int i =0; i<n; i++){
//            call[i] = sc.nextInt();
//        }
//        for (int i =0; i<n; i++) {
//            Ypay += (call[i] / 30) * 10;
//            Mpay += (call[i] / 60) * 15;
//        }
//
//            if(Ypay > Mpay) {
//                System.out.println("M " + Mpay);
//            } else if(Ypay < Mpay) {
//                System.out.println("Y " + Ypay);
//            } else {
//                System.out.println("Y M " + (Ypay));
//            }
//
//        }
//    }

