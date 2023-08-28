package 자동차만들기실습;

public class Sadan extends Car {
    String name;

    Sadan(String name) {
        carname = name;
        fuelEFF = 12;
        speed = 200;
        fuelTank = 45;
        seat = 4;
    }
    @Override
    public void addOption(boolean isOption){
        if (isOption) seat += 1;
    }

}