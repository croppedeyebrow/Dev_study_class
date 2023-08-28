package 자동차만들기실습;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dist = {0,400,150,200,300};
        Car car = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("목적지를 고르세요 [1]부산 [2]대전 [3]강릉 [4]광주 :");
        int city = sc.nextInt();


        System.out.print("승객 수 :");
        int passengers = sc.nextInt();


        System.out.print("차량을 선택하세요 [1] 스포츠카 [2] 승용차 [3]버스 : ");
        int vehichle = sc.nextInt();

        switch (vehichle) {
            case 1 : car = new SportsCar("아벤타도르"); break;
            case 2 : car = new Sadan("링컨"); break;
            case 3 : car = new Bus("9000"); break;
            default : System.out.println("번호를 잘 못 선택하셨습니다.");
        }
        System.out.println("부가 기능을 선택하세요 [1]ON [2]OFF :");
//        int n = car.movecount(passengers);
        int Option = sc.nextInt();
        if(Option == 1) car.addOption(true);
//        else car.addOption(false);
        int movecount = car.movecount(passengers);


        System.out.println("=====" +car.getCarname() + "=====");
        System.out.println("총 비용 :" + car.totalcost(dist[city], movecount)) ;
        System.out.println("총 주유 횟수 :" + car.fuelCount(dist[city], movecount)+ "회");
        System.out.println("총 이동 시간 : " + car.totaltime(dist[city]));


    }
}
