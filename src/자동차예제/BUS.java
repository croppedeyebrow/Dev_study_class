package 자동차예제;

 class Bus extends Car{
    String name;
    Bus(String name) {
        carName = name;
        fuelEfficiency = 5;
        speed = 150;
        fuelTank = 100;
        seat = 20;
    }

    @Override
    public void addOption(boolean isOption) {
        if(isOption) fuelTank += 30;
    }
}


