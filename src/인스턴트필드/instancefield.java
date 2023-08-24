package 인스턴트필드;

public class instancefield {
    public static void main(String[] args) {
        int val =30; // 지역 변수
        FieldTest fieldTest1 = new FieldTest();
        fieldTest1. insstanceVal = 200; /// 각각의 객체 마다 값을 다르게 설정 할 수 있음
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.insstanceVal = 300;

        FieldTest.classval = 1000;

    }
}
