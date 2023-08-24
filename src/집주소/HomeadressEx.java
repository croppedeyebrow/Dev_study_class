package 집주소;

import java.util.Scanner;

// 각 숫자 사이에는 1칸의 여백, 1칸은 1cm
// 1은 2칸의 너비, 0은 4칸의 너비, 나버지는 3칸의 너비를 차지
// 호수판으 ㅣ경계와 숫자 사이에는 1칸의 여백이 들어가야한다.
// 호수판에 들어갈 숫자 1<= n <= 9999
// 마지막에 0이 들어오기 전까지 계속.
public class HomeadressEx {
    public static void main(String[] args) {
        int[] numwidth = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += numwidth[num.charAt(i) - '0'] +1;
            }
            System.out.println(sum + 1);
        }
    }
}



