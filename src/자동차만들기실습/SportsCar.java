package 자동차만들기실습;

public class SportsCar extends Car {
    String name;

    SportsCar(String name) {
        carname = name;
        fuelEFF = 8;
        speed = 250;
        fuelTank = 30;
        seat = 2;
    }
    @Override
    public void addOption(boolean isOption){
        if (isOption) speed *= 1.2;
    }

}
