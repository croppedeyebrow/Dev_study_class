package 자동차예제;



abstract class Car {
    protected int speed;
    protected int fuelEfficiency;
    protected int fuelTank;
    protected int seat;
    protected int moveCount;
    protected String carName;

    // 차량 이름 표시
    public String getCarName() {
        return carName;
    }
    // 이동 횟수
    public int MoveCount(int passenger) {
        if(passenger % seat != 0) moveCount = (passenger / seat) + 1;
        else moveCount = passenger / seat;
        return moveCount;
    }

    public int fuelCount(int dist) {
        if(((dist * moveCount) / fuelEfficiency) % fuelTank != 0) return (((dist * moveCount) / fuelEfficiency) / fuelTank) + 1;
        return ((dist * moveCount) / fuelEfficiency) / fuelTank;
    }

    public int totalCost(int dist) {
        return dist * moveCount / fuelEfficiency * 2000;
    }

    public double totalTime(int dist) {
        return (double)dist * moveCount / speed;
    }

    public abstract void addOption(boolean isOption);
}