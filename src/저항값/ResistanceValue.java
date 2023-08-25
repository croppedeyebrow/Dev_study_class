package 저항값;

import java.util.Scanner;

// 저항은 색 3개를 이용해서, 그 저항이 몇 옴인지 구한다.
// 처음 색 2개는 저항의 값ㅎ이고, 마지막 색은 곱해야 하는 값이다.
// 저항의 색이 yellow,violet,red 였다면 저항의 값은 4700이다.
//첫번째 저항값에 10을 곱한다.
public class ResistanceValue {
    public static void main(String[] args) {
        String[] Color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] multiple = {1,10,100,1000,10000,100000,10000000,100000000,100000000,1000000000};
        int Fn =0, Sn =0, Tn=0;
//        int Sn =0;
//        int Tn =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("3가지 색상을 입력하세요");

        String Fco = sc.nextLine();
        String Sco = sc.nextLine();
        String Tco = sc.nextLine();

        for (int i=0; i < 10; i++){
            if (Fco.equals(Color[i])) Fn = i;
            if (Sco.equals(Color[i])) Sn = i;
            if (Tco.equals(Color[i])) Tn = multiple[i];
        }
        System.out.println((long)((Fn * 10) + Sn ) * Tn);

    }
}
