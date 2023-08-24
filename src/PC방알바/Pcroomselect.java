package PC방알바;
// 1번부터 100번까지의 컴퓨터.
// 거절당하는 사람의 수를 출력.

import java.util.Scanner;

public class Pcroomselect {
    public static void main(String[] args) {

//        int[] pcseat = new int[100];
//        int seat;
//        int cnt = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("들어온 손님 수 : ");
//        int n = sc.nextInt();
//        System.out.print("선택한 자리 번호 : ");
//        for(int i = 0; i < n; i++) {
//            seat = sc.nextInt();
//            if(pcseat[seat - 1] == 1) cnt++;
//            else pcseat[seat -1] = 1;
//        }
//        System.out.println("거절 당한 사람은 : " + cnt + "명 입니다");
//    }
//}

        int[] pcroom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //인원수를 입력 받음
        for (int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if (pcroom[seatNum - 1] == 1) rejectCnt++;
            else pcroom[seatNum - 1] = 1;
        }
        System.out.println(rejectCnt);
    }
}
























