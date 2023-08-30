package 홀짝나눠담기;
// 7개의 정수를 입력 받는 메서드 만들기
// 홀수와 짝수 배열로 나누어 담는 메서드 만들기
// 홀수와 짝수를 출력 하는 메서드 만들기
// 입력: 1 2 3 4 5 6 7
// 홀수: 1 3 5 7
// 짝수: 2 4 6
// 클래스를 생성해서 만들기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayMethod {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    //정수를 입력 받는 메소드
    void InputValue() {
       int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");
        while (true) {
            tmp = sc.nextInt();
            if (tmp ==7) break;
            inList.add(tmp);
        }
    }
    void divideMethod() {
        for (Integer e : inList) {
            if (e % 2 ==0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printMethod() {
        System.out.print("홀수 : ");
        for (Integer e : oddList)
            System.out.print(e + "  ");
        System.out.println();
        System.out.print("짝수 : ");
        for (Integer e : evenList)
            System.out.print(e + "  ");
        System.out.println();
    }
}


