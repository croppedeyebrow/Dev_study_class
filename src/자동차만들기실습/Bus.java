package 자동차만들기실습;

public class Bus extends Car {
    String name;

    Bus(String name) {
        carname = name;
        fuelEFF = 5;
        speed = 150;
        fuelTank = 100;
        seat = 20;
    }
    @Override
    public void addOption(boolean isOption){
        if (isOption) fuelTank += 30;
    }

}