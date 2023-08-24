package 메소드와필드;
// 메소드 : 클래스 내에서 동작에 대한 기능을 구현하는 것(함수가 클래스 내부에 있으면 메소드로 함)
// 필드 : 객체의 값을 저장하는 변수를 의미(상태를 저장)
public class methodandfield {
    public static void main(String[] args) {
        //호출부
//        int result = sum(100, 200,300,400); //매개변수의 개수를 알 수 없는 경우 사용
//        int result = recFunc(10);
        int result = whileSum(10);
        System.out.println(result);


    }
    // 메소드 앞에 static을 선언하는 경우 객체 소속이 아니고 클래스 소속
    // stack 구조는 입*출력이 한군데에서 같이 일어난다.

    static int sum(int a, int b) { //구현부
        return a + b;
    }
    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립

    static int sum(int a, int b, int c) { //구현부
        return a + b + c;
    }

    static int sum(int... val) { //매개변수 개수를 모를 때, 전개연산자 사용
        int sum = 0;
        for (int e : val) sum += e;
        return sum;
    }

    //재귀호출 : 메소드 자신이 자신을 호출 하는 것, <하노이의 탑 이해하기>
    static int recFunc(int n) {
        if (n == 1) return 1;
        return n + recFunc(n - 1);

    }

    static int whileSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }
}




