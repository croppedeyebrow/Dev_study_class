package 별찍기연습;

import java.util.Scanner;

// 삼각형 별찍기
// 입력 받은 수만큼 별찍기
// 5를 입력 하면
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수를 입력하세요");
        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
           // for (int j = 0; j < star; j++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


