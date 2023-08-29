package 자동차만들기실습2;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car;
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int A = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int B = sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int C =sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int D =sc.nextInt();

        switch (C){
            case 1: car = new SportsCar(A,B,D);
                car.sub(A,B,D);

                break;
            case 2: car = new Sedan(A,B,D);
                car.sub(A,B,D);
                break;
            case 3:car = new Bus(A,B,D);
                car.sub(A,B,D);
                break;
            default:
                System.out.println(" ");
        }

    }
}

