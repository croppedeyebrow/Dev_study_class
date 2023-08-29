package 클론오브젝트;

public class Cloneobject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1.getMember(); // 얕은 복사가 일어나는 조건.
        mem1.viewInfo();
        mem2.password = "klkkkkkk";
        mem2.name = "kh정보교육원";
        mem2.viewInfo();
        mem1.viewInfo();

//        System.out.println("name : " + mem1.name);
//        System.out.println("name : " + mem2.name);
//
//        System.out.println("name : " + mem1.age);
//        System.out.println("name : " + mem2.age);
    }
}








