package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;


public class AirconMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAircon = new AirCon();
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도를 변경하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까? (yes/no) : ");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            lgAircon.setPower(true);
            lgAircon.setAirConState();
            while (true) {
                sleep(1000);
                elapsedTime++;
                switch (lgAircon.getWindStep()) {
                    case 1 : if (elapsedTime >= 60) isSetTemp = true; break;
                    case 2:  if (elapsedTime >=30) isSetTemp = true; break;
                    case 3: if (elapsedTime >=20) isSetTemp = true; break;
                    default: if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if (lgAircon.isHeater()) lgAircon.setCurrTemp(1);
                    if (lgAircon.isCooler()) lgAircon.setCurrTemp(-1);
                    lgAircon.airConInfo();
                    isSetTemp = false; // 온도 변경 이후 초기화
                    elapsedTime = 0; // 온도 변경 이후 초기화
                }
                if (lgAircon.getCurrTemp() == lgAircon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다");
                    break;
                }
            }

        }
    }
}
