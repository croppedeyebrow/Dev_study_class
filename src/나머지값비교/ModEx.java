package 나머지값비교;

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        int[] arr = new  int[42]; // 나머지를 만들기 위해, 42미만의 수를 나열( 0~41)
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        int input; // 입력 받은 값
        Scanner sc = new Scanner(System.in) ;
        System.out.print("10개의 숫자를 입력하세요");
        for (int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1; // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1를 대입
        }
        for (int val : arr) cnt += val; // val, 변수 선언.
        System.out.println(cnt);

    }
}
