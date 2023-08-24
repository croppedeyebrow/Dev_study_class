package alarmsangun;

import java.util.Scanner;

// 시간과 분을 입력
public class AlarmEX1 {
    public static void main(String[] args) {
        //시간과 분을 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        //시간과 분을 각각 입력 받음
        System.out.print("시간 분 입력:");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        //45분을 빼야 되므로 시간과 분을 총 몇분인지 환산하고 45분을 빼줌
        int totalmin = hour * 60 + min;
        //계산된 시간이 45분 보다 작으면 하루전날 이므로 하루의 시간 만큼 더해줌
        if (totalmin < 45) {
            totalmin = (24 * 60) + totalmin;
        }
        //계산된 시간에서 45를 빼줌
        totalmin -= 45;
        //결과를 시간과 분으로 환산해서 출력 해줌
        System.out.println((totalmin / 60) + "시" + (totalmin % 60) + "분");
    }
}
