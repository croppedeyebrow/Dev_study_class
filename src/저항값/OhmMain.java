package 저항값;

import java.util.Scanner;

//저항값 구하기 : 컬러 문자열 3개를 입력 받음
// 첫번째 컬러: 문자열은 10의 자리수
// 두번째 컬러 문자열은 1의 자리수
// 세번째 컬러 문자열은 곱하는 수
public class OhmMain {
    public static void main(String[] args) {
        String[]color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        int frt=0, sec=0, thd=0;
        Scanner sc = new Scanner(System.in);
        String frtColor = sc.nextLine();
        String SecColor = sc.nextLine();
        String thdColor = sc.nextLine();
        for (int i =0; i < color.length; i++) {
            if (frtColor.equals(color[i])) frt= i;// 첫번재 입력받은 컬러 문자열의 인덱스 값을 구함(10의 자리값)
            if (SecColor.equals(color[i])) sec= i; //두번재 입력받은 컬러 문자열의 인덱스 값을 구함(1의 자리값)
            if (thdColor.equals(color[i])) thd= i; // 세번째 입력 받은 컬러 문자열의 인덱스 값을 구함(곱하는 수)
        }
        System.out.println((long) ((frt * 10)+sec)*Math.pow(10,thd));
        // Math.pow(대상숫자,지수) --> '거듭제곱 구하는'
    }
}
