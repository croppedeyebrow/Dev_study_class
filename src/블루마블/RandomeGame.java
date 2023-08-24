package 블루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임

public class RandomeGame {
    public static void main(String[] args) {
      int rand1, rand2;
      int cnt = 0; // 몇번만에 탈출 했는지 숫자 세기
        while (true) {
            cnt++;
            rand1 = (int) ((Math.random() * 6) + 1);
            rand2 = (int) ((Math.random() * 6) + 1);
            if ((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출 했습니다./n", cnt);
                break;
            } else{
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다");

            }
        }
    }
}
