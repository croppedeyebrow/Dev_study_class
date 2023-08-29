package 다중인터페이스;

import javax.print.DocFlavor;

public class Car {
    protected int speed; // 상속 관계가 성립되면 접근 가능
    protected  String color;
    protected String year;

    public Car() {
        speed = 150;
       this.color  = "white";
       this.year = "1999";

    }
}
