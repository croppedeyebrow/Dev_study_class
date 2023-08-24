package 싱글톤;
// 객체가 한번만 생성되는 것
public class SingletonMain {
    public static void main(String[] args) {
        Testobject1 member1 = new Testobject1();
        Testobject2 member2 = new Testobject2();
        for (int i = 0; i < 1000; i++) {
            member1.setInfo("동그라미", 27);
            member2.setInfo("우영우", 27);
        }
        member1.viewinfo();
    }
}













      //  Singleton test = new Singleton(); // 객체 생성을 할 수 없음.
//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj1.id = 1004;
//        obj1.name ="곰돌이사육사";
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);
//        obj2.id = 666;
//        obj1.name ="목사님";
//
//    }
//}
