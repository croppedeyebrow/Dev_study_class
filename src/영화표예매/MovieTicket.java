package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    //좌석의 개수
    int seat[] = new int[10]; //인스턴스 필드
    int ticketPrice;
    MovieTicket(int price) {
        ticketPrice = price;
    }
    // 판매된 좌석의 개수를 확인, 총 판매 금액을 구해서 반환

    int totalAmount() {
        int cnt = 0; // 지역변수
        for (int val : seat) { // val이라는 변수는 seat 배열을 처음부터 마지막까지 순회하는 요소
            if (val ==1) cnt++; // val이 1이면 판매된 좌석이라는 의믜.

        }
        return cnt * 13000; // 반환값이 int형
    }
    void printSeat() { //선택 가능한 좌석의 리스트를 보여 줌.
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print(" [ ] "); //판매가 안된 좌석
            else System.out.print(" [v] "); //이미 판매가 된 좌석을 의미
        }
        System.out.println();
    }

    void selectSeat() { //좌석을 판매하는 메뉴
        printSeat(); // 좌석 상태를 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택 하세요: ");
        int selseat = sc.nextInt();  // 유저가 선택한 좌석을 입력 받음 (유저는 1부터 생각함..)
        if (seat[selseat - 1] == 0) {
            seat[selseat - 1] = 1;
            printSeat();
        } else  System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택하세요");

        }
    }



