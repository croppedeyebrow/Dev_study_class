package 예외처리세번째;
// NullPointerException (NPE): JAVA에서 발생하는 대표적인 런타입 에러/
// 참조 하려는 객체가 없는 경우에 발생 합니다.

public class ExceptipnEx3
{
    public static void main(String[] args) {
        Test test = null;

          if(test != null) {
              String testStr = test.name;
          }else {
              System.out.println("testrk null 입니다.");
          }
    }
}

class Test {
        String name = "곰돌이사육사";
}
