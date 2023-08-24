package 상근날드;

import java.util.Scanner;

public class Arrayex {
    public static void main(String[] args) {
//        int[] menu = new int[5]; //햄버거 3개, 음료2개
//        //키보드 입력을 받기 위한 스캐너 객체 생성
//        Scanner sc = new Scanner(System.in);
//        System.out.print("메뉴를 고르세요");
//
//        for (int i = 0; i < menu.length; i++) menu[i] = sc.nextInt(); // 햄버거 3개, 음료 2개 금액을 입력 받음
//        int minberger = menu[0]; // 햄버거 중에 제일 싼 메뉴를 찾기 위한 시작 값
//        int mindrink = menu[3]; // 음료 중 제일 싼 메뉴를 찾기 위한 시작 값
//        for (int i = 0; i < menu.length; i++) {
//            if (i < 3 && minberger > menu[i]) minberger = menu[i];
//            if (i > 2 && mindrink > menu[i]) mindrink = menu[i];
//        }
//        System.out.println(minberger + mindrink - 50);
//    }
//}



                int[] burgerPrices = {800, 700, 900};
                int[] drinkPrices = {198, 330};
                int minPrice = Integer.MAX_VALUE; // 최소 가격을 저장하는 변수
                for (int i = 0; i < burgerPrices.length; i++) {
                    for (int j = 0; j < drinkPrices.length; j++) {
// 햄버거와 음료를 각각 한 개씩 선택하여 가격을 계산
                        int price = burgerPrices[i] + drinkPrices[j] - 50;
                        if (price < minPrice) { // 최소 가격보다 작으면 최소 가격 갱신
                            minPrice = price;
                        }
                    }
                }
                System.out.println("세트 메뉴의 최소 가격: " + minPrice);
            }
        }


