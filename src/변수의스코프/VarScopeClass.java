package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인
public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10;         // int형으로 선언된 변수 value에 10을 할당함.
//        int sum = value + 20;   // int형으로 선언된 변수 sum에 (value 값 + 20)을 할당함.
//        System.out.println("sum의 값 : " + sum);
//        int n = 20;               // 여기서 선언된 n은 아래의 에러 식까지 적용됨. 중괄호 바깥에 있기 때문.
//        if (n > 10) {             // n은 블록 스코프. 중괄호가 끝나면 n의 범위는 사라짐.
//            int m = 30;           // n이 먼저 주어졌으므로 m의 초기값은 적용되지 않음.
//            m = n - 10;
//            System.out.println("m 값 : " + m);
//        }
//        int k = n + m;            // m의 초기값이 선언되지 않았음.
//    }

        byte num1 = 127;            // 128을 대입하게 되면 오류 뜸. (-128 <= byte <= 127)
        num1++;                     // 127이 128이 되는데 요거는 intellij에서 오류 못 잡음.

        System.out.println(num1);   // -128이 출력됨. 127에서 1이 증가하면서 맨앞의 부호자리를 건드리게 됨. [overflow]
    }
}
