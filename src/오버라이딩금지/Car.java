package 오버라이딩금지;

public class Car {
    int speed;
    String color;
    String name;

    final void accelerator() { //fianl: 변경 금지시키는 기능.
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }

}
class  sportsCar extends Car {
    boolean isTurbo;
    sportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";

    }

//    @Override // @~의기능: 문법적으로 성립하는지를 체크/ @override: 관계가 맞는지 체크.
//    void  accelerator() {
//        super.accelerator(); // super : 상위값(부모)를 불러오고, 자신것을 수행
//        System.out.println("차의 속도를 200% 증가 시킵니다");
//
//    }
//
//    @Override // @~의기능: 문법적으로 성립하는지를 체크/ @override: 관계가 맞는지 체크.
//    void  breakPanel() {
//        super.breakPanel(); // super : 상위값(부모)를 불러오고, 자신것을 수행
//        System.out.println("차의 속도를 200% 감소 시킵니다");
//
//    }
    int getSpeed() {
        if (isTurbo) return  speed *= 1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;
    }
    public  void setTurbo(boolean turbo){
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름:" +name);
        System.out.println("속도:" +getSpeed());
        System.out.println("색상:" + color);
        System.out.println("터보모드:" +isTurbo);
    }
}