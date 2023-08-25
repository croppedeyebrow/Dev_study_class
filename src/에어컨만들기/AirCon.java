package 에어컨만들기;

// 전원 :  ON /OFF
// 온도 설정 기능
// 현재 온도 표시 가능
// COOLAR ON/ OFF
// Heater ON/OFF
// 바람세시 : 1단/2단/3단


import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower; // OF&OFF'
    private int setTemp; // 온도 설정
    private int currTemp; //현재 온도
    private boolean isCooler; //냉방기
    private boolean isHeater; // 난방기
    private int windStep; // 1단, 2단, 3단

    AirCon() {
        // 에어컨의 현재 온도를 보여주기 위한 값
        final int[] MonthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance(); //현재 운영체제(로컬)의 시간을 땅겨오는 것.
        // GMT를 활용한 경우 로컬(운영체제)시간과의 차이 고려해야함// 경과시간을 구할 경우 UTC고려.
        int month = now.get(Calendar.MONTH); // 배열의 인덱스와 동일
        currTemp = MonthTemp[month]; // 배열에 설정한 온도 정보를 가져 옴
        isPower = false;
        setTemp = 18; // 사계절의 중위값 정도로 초기 온도 설정.
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isPower) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("현재 온도:" + currTemp);
        System.out.println("히터:" + heaterStr);
        System.out.println("쿨러: " + coolerStr);
        System.out.println("바람세기:" + windStr[windStep]);
    }

    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + "입니다.");
        System.out.print("온도를 설정 하세요: ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "입니다.");
        System.out.println("바람 세기를 설정하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) { // 설정 온도가 현재 온도보다 낮은 상태 즉, 더운 상태.
            System.out.println("cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) { //설정 온도가 현재 온도보다 높은 상태 즉, 추운 상태
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getWindStep() {
        return windStep;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public void setCurrTemp(int n) {
        currTemp += n;
    }

    public int getCurrTemp() {
        return currTemp;
    }

    public int getSetTemp() {
        return setTemp;

    }
}

