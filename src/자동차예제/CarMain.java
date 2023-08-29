package 자동차예제;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        int[] dist = {0, 400, 150, 200, 300};
        Car car = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();
        System.out.print("승객 수 : ");
        int passengers = sc.nextInt();
        System.out.print("이동 차량 [1]스포츠카 [2]승용차 [3]버스 : ");
        int transportation = sc.nextInt();
        switch(transportation) {
            case 1 : car = new SportsCar("박스터"); break;
            case 2 : car = new Sedan("링컨"); break;
            case 3 : car = new Bus("9000번"); break;
            default : System.out.println("차량 선택을 잘못 하셨습니다.");
        }
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        if(option == 1) car.addOption(true);
        car.MoveCount(passengers);

        System.out.println("====== " + car.getCarName() + " ======");
        System.out.println("총 비용 : " + car.totalCost(dist[city]) + "원");
        System.out.println("총 주유 횟수 : " + car.fuelCount(dist[city]) + "회");
        System.out.printf("총 이동 시간 : %.2f\n",car.totalTime(dist[city]));
    }
}
