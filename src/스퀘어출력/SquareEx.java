package 스퀘어출력;
// input : 4
// outpur
// 1  2  3  4
// 5  6  7  9
// 9 10 11 12

import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        int number = sc.nextInt();
        for ( int i = 1; i <= number * number; i++) {
            System.out.printf("%4d", i);
            if (i % number ==0) System.out.println();
        }
    }
}
