package for문;
// for(조기식;조건식;증감식) { 참인 동안 수행되는 구문}
// 주로 정해진 횟수로 반복하는 경우에 사용됩니다
public class For반복문 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
        }
    }
}
