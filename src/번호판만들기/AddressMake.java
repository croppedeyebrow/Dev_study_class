package 번호판만들기;

import java.util.Scanner;

// 숫자를 입력
// 해당 숫자의 몇 칸을 차지하는 지를 출력하는 문제
// 0을 입력하면 종료
public class AddressMake {
    public static void main(String[] args) {
        // 각 숫자가 차지하는 자리수를 배열로 만들기
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum =0; // 입력 받은 수가 차지하는 총 자리수 계산하기위한 변수.
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if (number.equals("0")) break; // 0이 입력 되면 탈출(끝남)
            for (int i = 0; i <number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] +1; // 1을 더하는 이유는 각 숫자마다 여백이 1칸
            }
            System.out.println(sum + 1); // 1을 더하는 이유는 처음 공백을 더해 줌
            sum = 0; // 다음 계산을 위해, sum 변수를 초기화 함.

        }

    }
}
