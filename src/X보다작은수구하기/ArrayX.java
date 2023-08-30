package X보다작은수구하기;

import java.util.ArrayList;
import java.util.Scanner;

// 배열 A 와 정수 X 가 주어진다.
// 배열 A에서 X보다 작은 수를 모두 출력
// 1 <= N,X <=10000
// 수 사이에 공백, X보다 작은 수는 적어도 하나 존재.
public class ArrayX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        //N과X를 입력.
        int N = sc.nextInt();
        int X = sc.nextInt();

        // 정수 배열 A를 생성.
        ArrayList<Integer> A = new ArrayList<>();
        for (int i =0;  i<N; i++ ){
            int num = sc.nextInt();
            A.add(num);
        }
       // ArrayList<Integer> X = new ArrayList<>();
        for (int num: A ) {
            if (num<X) {
                System.out.print(num + "  ");
            }
        }



    }


}
