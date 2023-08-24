package 클래스기본;

public class Classbasic {
    public static void main(String[] args) {
        // public -> 캡슐화, 접근제한이 없다는 것
        Student s1 = new Student();
        s1.showInfo();
        s1.setName("곰돌이사육사");
        s1.setAddr("경기도 수원시");
                //new -> heam영역에 동적할당(동작하는 중에 메모리 확보)하는 것.
        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();


        Student s3 = new Student();
        s3.setName("유나");
        s3.setAddr("수원시 팔달구");
        s3.showInfo();
    }
}
