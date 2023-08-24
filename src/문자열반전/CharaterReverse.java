package 문자열반전;
// 문자열을 입력 받음 : abcd -> dcba
// 문자열의 길이는 length()로 확인 가능
//
import java.util.Scanner;

public class CharaterReverse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자를 입력하세요");
//        String input = sc.next();
//        int pos = input.length() - 1;
//        while (pos > -1) {
//            System.out.print(input.charAt(pos));
//            pos--;
//        }
//    }
//}
Scanner sc = new Scanner(System.in);
int i;

System.out.print("문자를 입력하세요");
        String str = sc.next();
        sc.nextLine();
        for (i= str.length()-1; i>=0; i--) {
           System.out.printf("%c", str.charAt(i));

        }
        }
        }


