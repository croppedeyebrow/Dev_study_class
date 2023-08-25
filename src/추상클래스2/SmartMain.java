package 추상클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy Z flip");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
