package 스트링다루기;
// StringBuffer(동기화 지원), StringBuilder(동기화 지원하지 않음) 둘 다 문자열을 추가하거나 변경할 때 사용.
//스레드 동기화는 멀티스레드 환경에서 여러 스레드가 하나의 공유자원에 동시에 접근하지 못하도록 막는것
//String 자료형과 어떤 차이가 있는지만 이해하면 됨.
public class StringBufferEX {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 긴 문자열에는 stringbuilder,buffer가 적당.
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);

        //string -> 각각의 문자를 따로 만들어서 이어 붙이는 것, 새롭게 만들기에 문장이 길어질수록 불리
        String st = " "; //공백값(화이트스페이스)으로 취급하기에 null;도 가능, 참조타입 & 기본타입 둘 다 가능.
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        //insert : 해당 offset에 문자열을 추가.
        //sb2.insert(0, "hello");
        System.out.println(sb2);
        sb2.delete(7,10);
        System.out.println(sb2);
        System.out.println(sb2.substring(0,4));



    }
}
