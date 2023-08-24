package 영화표예매;

import java.util.Scanner;

// 간단한 영화표 예매 시스템에 대한 예제 입니다.
 // 사용자 극장의 좌석을 선택, 판매는 좌석의 개수만큼 판매 금액을 계산.
 // 1. 예매하기와 종료하기메뉴
 // 2. 극장의 좌석은 10개
 // 3. 각 좌석 당 금액은 12000원
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(13000); // 생성자를 추가함, 좌석당 가격을 정할 수 있기 때문.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2} 종료하기");
            System.out.println("=>");
            if (sc.nextInt() ==1) movieTicket.selectSeat();
            else {
                System.out.println("총 판매 금액 :" +movieTicket.totalAmount());
                break;
            }

        }
    }
}
