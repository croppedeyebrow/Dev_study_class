package 자동차만들기실습;
// 연비가 8이면 1리터로 8km를 갈 수 있음/ 50리터로 400km를 갈 수 있다.
// 총거리가 10km 연비가 2km 기름값 1리터 2000원 => 5리터 필요.
// 이동 횟수 = 승객 수 / 좌석 수
//주유 횟수 = (거리*이동 횟수)/연비/연료 탱크 크기
//이동에 필요한 총 비용 = ((거리*이동횟수)/연비)/*기름값
//총 시간 = (거리 * 이동횟수)시속
//외부에서 입력 받는 정보 : 승객 수, 거리, 옵션.
abstract public class Car {
    protected int speed;
    protected int fuelEFF;

    protected  int fuelTank;

    protected int seat;

    protected  int movecount;

    protected String carname;

    //차량 이름 표시
    public String getCarname() {

        return carname;
    }

    public int movecount(int passengers) {

        if (passengers % seat != 0) movecount = (passengers / seat) +1;
        // %(나머지값구하기) /(나누기) 구분하기!
        else movecount = passengers/ seat;
        return movecount;
    }

    public int fuelCount(int dist, int movecount) {
        if (dist * movecount / fuelEFF % fuelTank != 0 )
            return dist * movecount/fuelEFF/fuelTank +1;
          return dist * movecount/fuelEFF/fuelTank;
    }

    public int totalcost(int dist, int movecount) {
        return dist * movecount / fuelEFF/fuelTank * 2000;
    }

    public double totaltime(int dist) {
        return (double) dist * movecount / speed;
    }

    public abstract void addOption(boolean isOption);

}
