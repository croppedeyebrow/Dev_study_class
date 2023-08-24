package 접근제한자;

public class AccessRestrion {
    public static void main(String[] args) {
        Child child = new Child("엔지니어");
        System.out.println(child.getname());
        System.out.println(child.getMoney());
        System.out.println(child.getaddr());
    }
}

//        Restrictor restrictor = new Restrictor() ;
//         restrictor.seoul(); // public 메소드, 같은 패키지 내에서만 접근 가능
//         restrictor.busan(); // protected 메소드, 같은 패키지거나 상속 관계가 있으면 접근 가능
//         restrictor.daegu(); //default 메소드
//         // restrictor.incheon(): // private 메소드에 대한 접근 ( 같은 클래스 내부가 아니기 때문에, 접근 허용이 안됨)


class  Child extends  Parent {
    String jobs;
    public Child(String jobs) {
        this.jobs = jobs;

    }
    public String getMoney() {
        return  money;
    }
    public String getname() {
        return  name;
    }
    public  String getaddr() {
        return  addr;
    }
}


