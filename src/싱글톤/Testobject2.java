package 싱글톤;

public class Testobject2 {
    Singleton single = Singleton.getInstance();
    void setInfo(String name, int id) {
        single.name = name;
        single.id = id;
    }
    void viewinfo() {
        System.out.println("이름:" + single.name);
        System.out.println("아이디:" + single.id);
    }

}
}
