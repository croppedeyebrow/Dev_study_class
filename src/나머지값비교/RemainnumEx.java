package 나머지값비교;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 두 자연수 A와 B를 비교할 때, A%B는 A를 B로 나눈 나머지값
// A = 무작위 숫자 10개를 입력, 무작위 숫자의 범위 0 <= A <=1000
// B = 42
// A%B = 무작위 숫자 10개 중 1개를, 42로 나눈 나머지.
// A%B의 값 중 겹치지 않는 개수.
public class RemainnumEx {
    public static void main(String[] args) {
//        int[] B = {42};
//        int A;
//        int cnt;
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개를 입력하세요");
        Set<Integer> remainders = new HashSet<>(); // hashset은 Set인터페이스를 구현한 클래스, 중복된 값을 허용하지 않으며 입력한 순서는 보장x
        for (int i = 0; i < 10; i++) {
            int numA = sc.nextInt();
            remainders.add(numA % 42);
        }
        System.out.println(remainders.size());
    }
}





//            B[ A % 42] = 1;
//        }
//        for (int i =0; i < B.length; i++ ) {
//            cnt +=
