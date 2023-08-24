package 문자열다루기;
 // 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형입니다.
 // equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함 (true/false), ==는 문자열 주소가 같은지를 물어보는 것
 // indexof: 문자열에서 특정 문자가 시작되는 인덱스를 반환
 // contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
 // charAt: 문자열에서 특정 위치의 문자를 반환
 // replace : 문자열 중에서 특정 문자열을 다른 문자열로 변환
 // replaceALL : 문자열 중에서 특정 문자열을 다른 문자열로 변경, 문장의 정규식(규칙)도 변경 가능//아무것도 안넣으면 삭제도 가능.
 // substring : 문자열 중 특정 부분을 뽑아 낼 때 사용 ( 시작 인덱스만 주는 경우와 시작과 끝을 주는 경우가 있음)
 // touppercase/ tolowercase : 문자열 전부를 대문자/ 소문자 변경하는 메소드
 // trim : 문자열 앞뒤의 공백을 잘라냄.
 // split : 문자열을 특정 구분자로 분리하는 메소드
 // tocharArray() : 문자열을 문자 배열로 반환 합니다.

public class StringMethod {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "java";
//        String c = "Hello";
//        String d = new String( "hello");
//
//        System.out.println(a.equals(d)); //true
//        System.out.println(a.equals(c)); //false
//        System.out.println(a.equalsIgnoreCase(c)); // 문자열을 비교하는데 대소문자 구분 안함
//        System.out.println(a.indexOf("lo"));
//        System.out.println(a.indexOf("lt")); //문자가 시작되는 인덱스 반환. // 인덱스에서 -1은 없다의 의미.

        String a = "hello java";
        String b = "java";
        String c = "Hello";
        String d = new String( "hello");

        System.out.println(a.contains("java"));
        System.out.println(a.charAt(4));

        String e = "Hello Java";
        System.out.println(e.replaceAll( "Java","" ));
        System.out.println(e.substring(4,7));
        System.out.println(e.toUpperCase()); //대문자
        System.out.println(e.toLowerCase()); // 소문자

        String oldstr = "자바 프로그래밍";
        System.out.println(oldstr.trim());

        String time = "10:23:45";
        String[] modifyTime = time.split( ":");
         for (String eee : modifyTime) System.out.print(eee + " ");
         System.out.println();


         // 문자열 포맷팅을 출력을 위해서 사용
         System.out.printf("I eat %d apples./\n", 3);

          String test = String. format("i eat %d apples.",  3);






    }
}
