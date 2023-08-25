package 추상클래스2;


// Phone은 인스턴스(객체)화 될 수 없음
public abstract class Phone {
    public String name;
    public boolean ispower;
    public Phone(String name) {
        this.name = name;

    }
    public void setPower(boolean ispower) {
        this.ispower = ispower;
        if (ispower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call();
}
