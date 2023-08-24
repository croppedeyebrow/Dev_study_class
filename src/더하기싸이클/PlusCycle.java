package 더하기싸이클;
// 입력 받은 수를 더하기 싸이클 조건을 수행했을 때 몇 회만에 원래 입력한 수와 같아지는지 확인하는 문제.
// 입력 26 = 2와 6으로 분리해서 더함 => 8
// 원래 값의 1의자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 ==> 68
// 1 싸이클
// 68 => 6과 8과를 분리해서 더함 => 14
// 원래 값의 1의자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 ==> 84
// 84 => 8과 4를 분리해서 더함 => 12
import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
//        int[] Cycle = new int[99];
//        int x = 0, y = 0;
//        for (int i = 0; i <= 99; i++) {
//            Cycle[i] = sc.nextInt();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int input = sc.nextInt(); // 최초 숫자를 입력 받음.26
        int totalCnt = 0; // 총 싸이클 누적 횟수
        int calcNum = input; // 최초 입력값이 변경되지 않도록 하기 위해서.
        int divsum = 0; // 수를 10자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;
        while (true) {
            totalCnt++;
            divsum = (calcNum / 10) + (calcNum % 10); // 10의 자리와 1의 자리를 분리해서 더함, 2+6 = 8
            newNum = (calcNum % 10) * 10 + (divsum % 10); // 앞의 1의자리와 계산된 값의 1의자리를 더함  68
            if (newNum == input) break;
            calcNum = newNum;
        }
        System.out.println(totalCnt);
    }
}







