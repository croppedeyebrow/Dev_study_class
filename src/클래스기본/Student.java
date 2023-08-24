package 클래스기본;

public class Student {
    private int ID; //학번, 필드라고 부름(인스턴스 필드)
    private String Name;  //이름, private = 캡슐화작업을 한 것
    //private 외부에서 해당 필드에 대한 접근 막음.
    private int grade; //학년
    private String addr; //주소

    //메소드
    public void showInfo() {
        System.out.println(Name + "," + addr);
    }

    //Setter 메소드
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddr(String addr) {
        this.addr = addr;

    }
}

